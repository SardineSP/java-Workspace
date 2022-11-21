package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {
		MethodTest1 m1 = new MethodTest1();
		m1.method1();
		
		int random = m1.method2();
		System.out.println("랜덤값 : " + m1.method2());
		
		m1.method3(3, 2);
		
		System.out.println(m1.method4(425, 3));
		
		
	}

}
