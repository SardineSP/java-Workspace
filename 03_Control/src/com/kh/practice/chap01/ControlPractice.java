package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";
		
		switch(num) {
		case 1 : menu = "입력"; break;
		case 2 : menu = "수정"; break;
		case 3 : menu = "조회"; break;
		case 4 : menu = "삭제"; break;
		case 7 : System.out.println("프로그램이 종료됩니다."); return; // 하기 다른 방법
		}
		//if(result.equals("종료")){
		//	System.out.println("프로그램이 종료됩니다.");
		//}else {
		//  System.out.println(result + " 메뉴입니다.");
	    //}
		System.out.printf("%s 메뉴입니다.", menu);
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		int avr = sum / 3; // double로 작성
		//if(kor >= 40 && math >=40 && eng >= 40 && avr >=60){

		if(kor >= 40) {
			if(math >= 40) {
				if(eng >= 40) {
					if(avr >= 60) {
						System.out.println("국어 : " + kor);
						System.out.println("수학 : " + math);
						System.out.println("영어 : " + eng);
						System.out.println("합계 : " + sum);
						System.out.println("평균 : " + avr);
						System.out.println("축하합니다, 합격입니다!");
					}
				}
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
		
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 1 :
		case 2 :
		case 12 : season = "겨울"; break;
		case 3 :
		case 4 :
		case 5 : season = "봄"; break;
		case 6 :
		case 7 :
		case 8 : season = "여름"; break;
		case 9 :
		case 10 :
		case 11 : season = "가을"; break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.", month); return;
		} // 어떻게 다른지 나중에 카톡공유 확인
		
		System.out.printf("%d월은 %s입니다.", month, season);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("java1111")) { //String은 참조자료형이라 동등비교가 안됨!!
			if(pw.equals("apple1111")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자": System.out.print("회원관리, 게시글 관리, ");
		case "회원" : System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.print("게시글 조회"); break;
		}
		
		
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		Double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		Double weight = sc.nextDouble();
		
		Double bmi = weight /(height*height);
		
		String result = "";
		if(bmi < 18.5) {
			result = "저체중";
		}else if (bmi < 23) {
			result = "정상체중";
		}else if (bmi < 25) {
			result = "과체중";
		}else if (bmi < 30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		
	}
	
	public void practice8() { // 이거 다시 공부해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char sig = sc.nextLine().charAt(0); // 왜? 해설에서는 nextLine()으로 함
		
		double result = 0;
		
		switch(sig) {
		case '+' : result = (num1 + num2); break;
		case '-' : result = (num1 - num2); break; 
		case '*' : result = (num1 * num2); break;
		case '/' : result = (num1 / num2); break;
		case '%' : result = (num1 % num2); break;
		default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
		}
		
		System.out.printf("%d %c %d = %s", num1, sig, num2, result);
		
	}
	
	//연습문제 11 >> 하드모드 풀어보기
	public void method11() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("비밀번호 입력 :");
		int pwd = sc.nextInt();
	
		if(pwd > 999 && pwd < 9999) { //자리수 체크
			int first = pwd % 10; //일의 자릿수 구하기
			int second = (pwd / 10) % 10;
			int third = (pwd / 100) % 10;
			int forth = (pwd / 1000) % 10;
			//중복값이 있는지 처리하기
			if(first == second && first != third && first != forth && second != third &&
					second != forth && third != forth) {
				//성공
				System.out.println("생성 성공");
			}else {
				System.out.println("중복 값 있음");
			}
			
		}else {//자리수가 3자리 이하거나, 5자리 이상인 경우 자리수 안맞음 출력 
			
			System.out.println("자리수 안맞음");
		}
		
		
	}

}
