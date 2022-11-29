package com.kh.chap01_math.run;

//import java.lang.*;
//생략가능, 보이진 않지만 항상 자동으로 java.lang 패키지가 import 되어있음.

public class MathRun {

	public static void main(String[] args) {
		
		// Math 클래스 (수학과 관련된 기능을 제공하고 있음.)
		
		//파이 => Math클래스 내에 상수필드로 정의되어있음.
		System.out.println("파이 : " + Math.PI);
		
		// 메서드명(매개변수) : 반환형
		//올림 => Math.ceil(double) : 반환값 double형
		double num1 = 4.349;
		System.out.println("올림 : " + Math.ceil(num1));
		
		//반올림 => Math.round(double) : 반환값이 long형
		System.out.println("반올림 : " + Math.round(num1));
		
		//버림 => Math.floor(double) : 반환값 double형
		System.out.println("버림 : " + Math.floor(num1));
		
		//가장 가까운 정수값을 알아낸 후 실수형 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num1));
		
		//절대값 => Math.abs(int/double/long/float) : 오버로딩된 메서드 : 반환값은 매개변수 그대로
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		
		//최소값 -> Math.min(int, int) : 반환값 int
		System.out.println("최소값 : " + Math.min(8, 20));
		
		//최대값 => Math.max(int, int) : 반환값 int
		System.out.println("최대값 : " + Math.max(5, 10)); //2가지 값만 받을 수 있으므로 여러개는 X
		
		//제곱근(루트) => Math.sqrt(double) : 반환값 double
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		//제곱 => Math.pow(double, double) : 반환값 double
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
	}

}
