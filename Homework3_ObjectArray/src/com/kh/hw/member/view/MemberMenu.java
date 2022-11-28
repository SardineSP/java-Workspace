package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.*;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
		System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", mc.existMemberNum());
		int num;
		
		if(mc.existMemberNum() != 10) {
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); return;
			}
		}else {
			System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();

			switch(num) {
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); return;
			}
		}
	}
	
	public void insertMember(){
		System.out.println("새 회원을 등록합니다.");
		System.out.println("아이디 : ");
		String inputId = sc.nextLine();
		
		System.out.println("이름 : ");
			
		System.out.println("비밀번호 : ");
//			
//		System.out.println("이메일 : ");
//			
//		System.out.println("성별(M/F)");
//		char gender = sc.nextLine().charAt(0);
//		if(gender != 'M' || 'm' || 'F' || 'f') {
//			System.out.println("성별을 다시 입력하세요");
//			System.out.println("성별(M/F)");
//			char gender = sc.nextLine().charAt(0);
//		}
//		System.out.println("나이 : ");

		
		insertMember();
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); return;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); return;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : deleteOne(); break;
		case 2 : deleteAll(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); return;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
}
