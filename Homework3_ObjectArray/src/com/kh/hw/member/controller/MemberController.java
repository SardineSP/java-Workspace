package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;
import com.kh.hw.member.view.MemberMenu;

public class MemberController {

	private Member[] m = new Member[SIZE];
	MemberMenu mm = new MemberMenu();
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int mem = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
			mem++;
			}
		}
		return mem;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] = mm.searchId) {
				
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
	}
	
	public String searchId(String id) {
		return "";
	}
	
	public Member[] searchName(String name) {
		return m;
	}
	
	public Member[] searchEmail(String email) {
		return m;
	}
	
	public boolean updatePassword(String id, String password) {
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		return true;
	}
	
	public boolean delete(String id) {
		return true;
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		return m;
	}
}
