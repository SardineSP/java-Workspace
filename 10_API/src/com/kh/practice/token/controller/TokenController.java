package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			str += stn.nextToken();
		}
		return str;
	}
	
	public String firstCap(String input) {
		String input1 = input.toUpperCase();
		return	input1.substring(0, 1) + input.substring(1, input.length());
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
	}
	
	
}
