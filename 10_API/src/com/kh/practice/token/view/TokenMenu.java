package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.*;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		System.out.println("1. 지정 문자열");	
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		System.out.println("메뉴 번호 : ");
		int menu = sc.nextInt();
	}
	
	public void tokenMenu() {
		
	}
	
	public void inputMenu() {
		
	}
}
