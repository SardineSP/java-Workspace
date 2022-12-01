package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public Boolean checkDouble(int num1, int num2) throws NumRangeException {
		// 매개변수로 들어온 두 값이 1~100 사이일때 num1이 num2의 배수면 true,
		boolean result = false;
		if(num1 >= 1 && num1 <= 100 && num2 >=1 && num2 <= 100) {
			if(num1 % num2 == 0) {
				result = true;
			}
		}
		// 배수가 아니라면 false 반환
		
		// 1~100사이가 아니라면 NumRangeException 발생, 에러메시지는 출력값 참고
		
		return false;
	}	
}
