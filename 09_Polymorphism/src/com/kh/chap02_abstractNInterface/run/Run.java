package com.kh.chap02_abstractNInterface.run;

import com.kh.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		String[] arr = new PhoneController().method();
		for(String result : arr) { //향상된 for문
			System.out.println(result);
		}
	}

}
