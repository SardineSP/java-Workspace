package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		String s = "";
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			s += stn.nextToken();
		}
		return s;
		
		//방법2. StringBuffer or StringBuilder -> 이거 잘 복습!!
//		StringBuilder sb = new StringBuilder();
//		
//		While(stn.hasMoreTokens()){
//			sb.append(stn.nextToken());
//		}
//		
//		return sb.toString();
	}
	
	public String firstCap(String input) { // 이부분 input을 변수로 쓰면 안되지 않을까?
		String head = input.toUpperCase();
		input = head.substring(0, 1) + input.substring(1, input.length());
		return input;
		
		//풀이
//		String upper = input.substring(0, 1).toUpperCase();
//		return upper + input.substring(1); // -> subString 끝문자를 안써도 됨????
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0; i < arr.length; i++ /*char c : arr*/) {
			if(arr[i] == one /*c == one*/) {
				count++;
			}
		}
		return count;
		
		//방법 1.
//		for(int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
//		return count;
	}
	
	
}
