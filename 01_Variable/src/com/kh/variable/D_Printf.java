package com.kh.variable;

public class D_Printf {

	/*
	 * System.out.println(출력하고자하는 값); => 값을 출력하고 +개행(줄바꿈)까지 넣어줌
	 * System.out.print(출력하고자하는 값); => 값 출력만 해줌
	 * 
	 * System.out.printf("출력하고자하는 형식", 출력하고자 하는 값, 출력하고자...); 
	 * => f는 format(형식)을 의미
	 * => 형식에 맞춰서 값들이 출력이 되고 끝(줄바꿈x) 
	 * => 문자열 안에 그 값이 들어갈 자리에 다음과 같은 형식으로 잡아줘야 한다.
	 * 
	 * 형식 
	 * %d : 정수 
	 * %f : 실수 
	 * %c : 문자 
	 * %s : 문자열
	 * 
	 */


	public void printFtest() {
		// 정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
	    // iNum1 : xx, iNum2 : xx를 출력해보기
		//1. println을 사용해서 출력
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
	
		//2. printf를 사용 -> 정수값의 형식 %d를 사용해서 완성
		//					줄바꿈기능이 없으므로 직접 개행문자 (\n)를 추가해줄 것.
		System.out.printf("iNum1 : %d, iNum2 : %d \n", iNum1, iNum2);

		// 10 + 20 = 30을 출력해보기
		//1. println을 사용해서 출력
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		//2. printf 사용
		System.out.printf("%d + %d = %d \n", iNum1, iNum2, (iNum1 + iNum2));
		
		System.out.printf("%5d \n", iNum1); // %5d : 5칸의 공간을 띄우고 우측 정렬해줌 (넘치면 오른쪽으로)
		System.out.printf("%-5d \n", iNum1); // %-5d : 5칸의 공간을 띄우고 좌측 정렬해줌 (음수)
		
		//실수 테스트
		double dNum = 5.28759859;
		System.out.printf("dNum : %f \n", dNum);
		// %f : 소수점 아래 7번째 줄에서 반올림되어 소수점 아래 6번째까지만 출력됨
		
		System.out.printf("dNum : %.1f \n", dNum); 
		// %.1f : 소수점 아래 2번째줄에서 반올림되어 소수점 아래 1번째까지만 출력됨.
		// .자릿수로 제어 가능.
		
		// printf : 포맷 한번으로 간편하게 출력이 가능.
		// 단, 지정한 포맷의 갯수와 종류, 뒤에 오는 변수의 갯수와 종류가 정확하게 일치해야함.
		
		//문자와 문자열 테스트
		char ch = 'a';
		String str = "Greetings!";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S \n", ch, str); // %C, %S : 영어 알파벳일 경우 대문자로 변경해서 출력
		// %n도 개행이 되며 %%로 쓰면 %가 나옴
		
	}
}
