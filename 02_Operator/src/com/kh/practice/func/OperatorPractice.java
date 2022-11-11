package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
//		인원 수와 사탕 개수를 입력받고 
//		1인당 동일하게 나눠가진 사탕 개수와 남은 사탕 수 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수를 입력해주십시오 : ");
		int mem = sc.nextInt();
		
		System.out.print("사탕 개수를 입력해주십시오 : ");
		int can = sc.nextInt();
		
		int result1 = can / mem;
		int result2 = can % mem;
		
		System.out.printf("1인당 동일하게 나눠진 사탕 개수는 %d개이며, 남은 사탕의 개수는 %d개 입니다.", result1, result2);
				
	}
	public void practice2() {
		//입력받은 값들을 변수에 기록, 저장된 변수값을 화면에 출력하여 확인
		//성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt(); 
		
		System.out.print("반(숫자만) : ");
		int clas = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char mf = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String gender = mf == 'M' ? "남학생" : "여학생"; 
				
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, clas, num, name, gender, score);
		//printf 에서 사용되는 %뭐시기들 꼭 기억하기
		//풀이는 gender로 통일하고 프린트문 안에서 바로 (gender == 'M' ? "남학생" : "여학생")
	}
	public void practice3() {
		//나이를 입력받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		//성인(19세 초과)인지 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
	}
	public void practice4() {
		//국어, 영어, 수학 점수 입력
		//세 과목의 합, 평균을 구하기
		//세 과목 점수가 각각 40점 이상 && 평균 60점 이상이면 합격, 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int result = kor + eng + math;
		double avr = (result/3.0);
		
		String pass = kor >= 40 && eng >= 40 && math >= 40 && avr >= 60 ? "합격" : "불합격";
		
		System.out.println("합계 : " + result);
		System.out.printf("평균 : %.1f \n", avr);
		System.out.println(pass);
			
	}
	
	public void practice5() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		String gender = num % 2 == 0 ? "여자" : "남자";
		System.out.println(gender);
		//풀이에서는 "1, 3" / "2, 4"로 구분함, 1-2-3은 제어문자? '1'로 비교해야함?
	}
	
	///여기서부터 숙제 풀이
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
				
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = num3 <= num1 || num2 < num3 ? true : false;
		
		System.out.println(result);
		
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		//System.out.println((num1 == num2 == num3)? true : false); 자바에서 이건 안됨
		System.out.println((num1 == num2 && num2 == num3)? true : false);
		
	}	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int personA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int personB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int personC = sc.nextInt();
		
		double personAtotal = personA * 1.4;
		double personBtotal = personB;
		double personCtotal = personC * 1.15;
		
		System.out.println("A사원의 연봉/연봉+a : " + personA + "/" + personAtotal);
		System.out.println(personAtotal >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원의 연봉/연봉+a : " + personB + "/" + personBtotal);
		System.out.println(personBtotal >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("C사원의 연봉/연봉+a : " + personC + "/" + personCtotal);
		System.out.println(personCtotal >= 3000 ? "3000 이상" : "3000 미만");
		
		//부동소수점 : 정확성을 낮추고 표현범위를 높임 -> personc * personc + 0.15는 안됨
	}	
}
