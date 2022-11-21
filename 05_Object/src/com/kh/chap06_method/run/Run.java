package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {
		MethodTest1 m1 = new MethodTest1();
		m1.method1();
		
		int random = m1.method2();
		System.out.println("랜덤값 : " + m1.method2()); //return문은 그냥은 출력 안되니 주의
		
		m1.method3(3, 2);
		
		System.out.println(m1.method4(425, 3));
		
		System.out.println("=================================");
		
		//static 메서드의 경우에 new문으로 객체를 생성할 필요가 없다.
		//static이 붙은 클래스변수와 마찬가지로, 메서드 또한 프로그램 실행 시 정적메모리영역에 저장되기 때문.
		MethodTest2.method1();
		//MethodTest1.method1(); -> 이건 안됨

		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("이규정", 26);
		
		System.out.println(MethodTest2.method4(100));
		
		
	}

}
