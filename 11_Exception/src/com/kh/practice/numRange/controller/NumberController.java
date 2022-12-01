package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public Boolean checkDouble(int num1, int num2) throws NumRangeException { // 여기서는 예외처리 하지 않겠다고 쓴 것과 같음
		boolean result = false;
		if(num1 >= 1 && num1 <=100 && num2 >=1 && num2 <= 100) {
			if(num1 % num2 == 0) {
				result = true;
			}
		}
		return result;
	}
}
