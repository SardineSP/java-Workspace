package com.kh.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (i+1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력해주십시오 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() { //이런 단순대입이 답이 맞나...?
		String[] fruits = new String[5];
		
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String text = sc.nextLine();
		
		System.out.print("문자 : ");
		char alp = sc.nextLine().charAt(0);

		char[] arr = new char[text.length()];
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
			if(arr[i] == alp) {
				num2++;
			}
		}
		
		System.out.print(text + "에 " + alp + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
			if(arr[i] == alp) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.printf("%s 개수 : %d", alp, num2);
				
				
	}

	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		
		if(num <= 6) {
			for(int i = 0; i < 6; i++) {
				if(i == num) {
					System.out.print(day[i]);
				}
			}
		}else {
			System.out.print("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int score = sc.nextInt();
			arr[i] = score;
			sum += score;
		}
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.printf("총합 : %d", sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if(num % 2 == 1 && num >= 3) {
			for(int i = 0; i <= num / 2; i++) {
				if( i <= num / 2 ) {
					arr[i] = i + 1;
					System.out.print(arr[i] + ", ");
				}else { // 이부분 식이 맞는 것 같은데 출력이 안되는 이유를 모르겠음...
					arr[i] = (num - i);
					System.out.print(arr[i] + ", ");
				}
			}
		}else {
			System.out.println("다시 입력하세요");
			practice8();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String[] chicken = {"양념", "간장", "후라이드"};
		
		int correct = 0;
		for(int i = 0; i < 3; i++) { // 이부분 식이 맞는 것 같은데 출력이 안되는 이유를 모르겠음...
			if(name.equals(chicken[i])) {
				correct = i;
				System.out.println(correct);
				
			}else {
				System.out.println("no");
			}
		}
		
	}




}
