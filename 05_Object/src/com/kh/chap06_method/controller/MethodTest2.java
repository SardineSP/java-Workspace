package com.kh.chap06_method.controller;

public class MethodTest2 {
	static int count1 = 80;
	int count2 = 0;
	/*
	 * static 메서드
	 * [표현법]
	 * 접근제한자 static 예약어 반환형 메서드명(매개변수){
	 * 		수행내용
	 * 		return 반환값;
	 * }
	 * 
	 * - 호출시 객체 생성할 필요가 없음.
	 * - 프로그램 시작시에 정적 메모리 영역에 메서드가 저장되어있을 것이기 때문.
	 * - 클래스명.메서드명(전달값); 으로 호출이 가능.
	 * - 예약어, 매개변수, return은 생략 가능함.
	 */
	
	public static void method1() {
		System.out.println("매개변수와 반환값이 없는 메서드입니다.");
	}
	
	
	public static String method2() {
		return "매개변수는 없고 반환값은 있는 메서드입니다.";
	}
	
	public static void method3(String name, int age) {
		System.out.println(age + "살의 " + name + "님 환영합니다.");
	}
	
	public static int method4(int num1) {
		/*
		 * static 메서드 안에서는 static이 아닌 field 멤버가 접근이 불가능하다.
		 * static 메서드는 프로그램 시작시 정적메모리 영역에 들어가게 되는데
		 * 이때 static으로 선언된 필드(전역변수)도 함께 정적메모리 영역에 들어감.
		 * 하지만 static으로 선언되지 않은 전역변수는 static 메모리에 올라가는 시점에 사용이 불가능하므로
		 * 에러가 발생함
		 * 메모리 관리를 위해 너무 남용하는것은 지양?
		 */
		
		//static 메서드에는 static 필드만 사용이 가능하다.
		return num1 * count1; // int count2의 경우 heap 메모리에 저장되므로 객체가 생성되기 전에 사용 못함
		                      // static은 객체를 생성안하기 때문에 에러가 남(다른 영역에 있어서)
	}

}
