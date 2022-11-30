package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;
import com.kh.hw.member.view.MemberMenu;

public class MemberController {

	private Member[] m = new Member[SIZE];
//	MemberMenu mm = new MemberMenu();
	public static final int SIZE = 10;
	
	public int existMemberNum() {
//		int mem = 0;
//		for(int i = 0; i < m.length; i++) {
//			if(m[i] != null) {
//			mem++;
//			}
//		}
//		return mem;
		//향상된 for문으로 작성
		int count = 0;
		for(Member member : m) {
			if(member != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
//		for(int i = 0; i < m.length; i++) {
//			if(m[i] = mm.searchId) {
//				
//			}
//		}
//		return true;
		//향상된 for문으로 작성
		for(Member member : m) {
			if(member != null && member.getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		//멤버 저장
		for(int i = 0; i < SIZE; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age); // 이부분이 데이터를 저장하는 부분
				break;
			}
		}
	}
	
	public String searchId(String id) {
//		int result = 0;
//		
//		for(int i = 0; i < m.length; i++) {
//			if(m[i].equals(id) == true) {
//				result++;
//			}
//		}
//		if(result > 0) {
//			return "true";
//		}
//		return "false";
		//향상된 for문으로 작성
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				return member.toString();
			}
		}
		return ""; // 같은 id가 없을 경우?
	}
	
	public Member[] searchName(String name) { // 이부분이 잘 이해가 안감
//		int result = 0;
//		
//		for(int i = 0; i < m.length; i++) {
//			if(m[i].equals(name) == true) {
//				result++;
//			}
//		}
//		if(result > 0) {
//			return "true";
//		}
//		return "false";
		Member[] members = new Member[SIZE]; //이거 굳이 있어야하나? 앞에서 이미 선언한 것 같은디... 일단 이부분 돌려보고 고쳐보기
		int index = 0;
		for(Member member : m) {
			if(member != null && member.getName().equals(name)) {
				members[index++] = member;
			}
		}
		return members;
	}
	
	public Member[] searchEmail(String email) {
		Member[] members = new Member[SIZE]; //이거 굳이 있어야하나? 앞에서 이미 선언한 것 같은디... 일단 이부분 돌려보고 고쳐보기
		int index = 0;
		for(Member member : m) {
			if(member != null && member.getEmail().equals(email)) {
				members[index++] = member;
			}
		}
		return members;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean result = false;
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setPassword(password);
				result = true;
			}
		}
		return result;
	}
	
	public boolean updateName(String id, String name) {
		boolean result = false;
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setName(name);
				result = true;
			}
		}
		return result;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setEmail(email);
				result = true;
			}
		}
		return result;
	}
	
	public boolean delete(String id) {
		boolean result = false;
		for(int i = 0; i < SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}
	
	public void delete() {
		m = new Member[SIZE]; // 배열 초기화?
	}
	
	public Member[] printAll() {
		return m;
	}
}
