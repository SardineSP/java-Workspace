package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
			
		while(true) {
			System.out.println("=======KH사이트 =======");
			System.out.println("메인메뉴");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch(num) {
			case 1: joinMembership(); break;
			case 2: logIn(); memberMenu(); break;
			case 3: sameName(); break;
			case 9: System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			
			}
		}
	}
	
	public void memberMenu() {
		System.out.println("***** 회원 메뉴 *****");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름바꾸기");
		System.out.println("3. 로그아웃");
		System.out.println("메뉴 번호 선택 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			
			switch(num) {
			case 1: changePassword(); break;
			case 2: changeName(); break;
			case 3: System.out.println("로그아웃되었습니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			
			}
		}
	}
	
	public void joinMembership() {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		boolean result = mc.joinMembership(id, m);
		if(result) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		}else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}
	
	public void logIn() {
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			if(name == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}else {
				System.out.println(name + "님 환영합니다.");
				break;
			}
		}
	}
	
	public void changePassword() {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.println("변경할 비밀번호 : ");
		String newPw = sc.nextLine();
		boolean result = mc.changePassword(id, oldPw, newPw);
		if(result) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		}else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			changePassword();
		}
	}
	
	public void changeName() {

		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
			
		String name = mc.logIn(id, password);
		if(name == null) {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			changeName();
		}else {
			System.out.println(name + "님 환영합니다.");
			
			System.out.println("변경할 이름 : ");
			String changeName = sc.nextLine();
			mc.changeName(id, changeName);
			System.out.println("이름 변경에 성공하였습니다.");
		}
		
	}
	
	public void sameName() {
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		TreeMap tm = mc.sameName(name);
		
		Set<Entry<String, String>> entry = tm.entrySet(); //이부분 잘 이해 안감. Set, Entry가 뭐더라?
		for(Entry<String, String> e : entry) {
			System.out.println(e.getValue() + " - " + e.getKey());
		}
		
	}

}
