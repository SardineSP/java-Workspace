package com.kh.practice.numRange.controller;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public Boolean checkDouble(int num1, int num2) {
		if(num1 <= 100 && num1 >= 1 && num2 <=100 && num2 >= 1) {
			if(num1 % num2 == 0) {
				return true;
			}
			return false;
		}
		return false;
	}
}
