package com.kh.third;

public class MethodTest {
	//아래 것들은 명확하게 메인 메서드가 아님, 일반 메서드
	public void printMethodA() {
		
		System.out.println("프린트메서드A 츨력중!!");
		
		printMethodB(); //프린트메서드B를 실행하겠다는 의미
	}
	
	public void printMethodB() {
		
		System.out.println("프린트메서드B 출력중!!");
		
		printMethodC();
	}
	
	public void printMethodC() {
		
		System.out.println("프린트메서드C 출력중!!");
		
		//printMethodA(); 이렇게 하면 여기서 종료되고 반환됨?
	}
	

}
