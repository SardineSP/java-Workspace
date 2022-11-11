package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		
		System.out.print("수학 : ");
		float math = sc.nextFloat();
		
		/*
		 * int sum = (int)(kor + eng + math);
		 * int avr = sum/3;
		 */
		System.out.printf("총점 : %.0f \n", (kor + eng + math));
		System.out.printf("평균 : %.0f \n", (kor + eng + math)/3);
		
	}

	// double로!
	// 총점은 그냥 %d >> 정수형이니까...
	// 좀 더 코드를 간단하게 쓰는 연습을 해보자
	
}
