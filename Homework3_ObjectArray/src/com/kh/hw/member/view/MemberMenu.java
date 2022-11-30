package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.*;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu { //향상된 반복문 복습하고 다시 보기
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", mc.existMemberNum());
			
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
				
			switch(num) {
			case 1 : if(mc.existMemberNum() != 10) {
				insertMember(); 
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			} break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;	
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void insertMember(){
		System.out.println("새 회원을 등록합니다.");
		String id;
		while(true) { // id가 중복되면 메서드에서 false 반환.
			System.out.println("아이디 : ");
			id = sc.nextLine();
			if(mc.checkId(id)) {
				break;
			}
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.println("이메일 : ");
		String email = sc.nextLine();	
		
		char gender;
		while(true) {
			System.out.println("성별(M/F) : ");
			gender = sc.nextLine().charAt(0);
			if(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
				break;
			}
			System.out.println("성별을 다시 입력하세요");
		}
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		while(true) {
			switch(num) {
			case 1 : searchId(); break;
			case 2 : searchName(); break;
			case 3 : searchEmail(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void searchId() {
		System.out.println("검색할 아이디 : ");
		String id = sc.nextLine();
		
		String result = mc.searchId(id);
		if(result.equals("false")) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}
	}
	
	public void searchName() { //이부분 요 체크
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		
		Member[] members = mc.searchName(name); //이건 왜 Member[]?
		
		if(members[0] == null) { // 배열로 확인 후 null?
			System.out.println("검색 결과가 없습니다.");
			return; // 왜 리턴이 없었을까?
		}else {
			for(Member member : members) { //이부분은 뭣때문?
				if(member == null) {
					continue;
				}
				System.out.println(member);
			}
		}
	}
	
	public void searchEmail() { //이건 위랑 동일하니까 참고
		System.out.println("검색할 이메일 : ");
		String email = sc.nextLine();
		
		Member[] members = mc.searchEmail(email);
		
		if(members[0] == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}else {
			for(Member member : members) {
				if(member == null) {
					continue;
				}
				System.out.println(member);
			}
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		while(true) {
			switch(num) {
			case 1 : updatePassword(); break;
			case 2 : updateName(); break;
			case 3 : updateEmail(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}			
		}
	}
	
	public void updatePassword() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("수정할 비밀번호 : ");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id, password)){
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}
	
	public void updateName() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("수정할 이름 : ");
		String name = sc.nextLine();
		
		if(mc.updateName(id, name)){
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("수정할 이메일 : ");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id, email)){
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		while(true) {
			switch(num) {
			case 1 : deleteOne(); break;
			case 2 : deleteAll(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
}
