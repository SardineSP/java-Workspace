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
	
	public void practice5() { // 이것도 풀이 나중에 다시 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String text = sc.nextLine();
		
		System.out.print("문자 : ");
		char alp = sc.nextLine().charAt(0);

		char[] arr = new char[text.length()];
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < text.length(); i++) { //i < arr.length
			arr[i] = text.charAt(i);
			//arr[i] = str.charAt(i); //풀이에서는 이것만 사용
			if(arr[i] == alp) {
				num2++;
			}
		}
		
		//String index = "";
		
		System.out.print(text + "에 " + alp + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < text.length(); i++) { //i < arr.length
			arr[i] = text.charAt(i);
			if(arr[i] == alp) {
				//num1++; //-> 검색할 문자가 문자열에 몇개 있는지 
				//index += i + ""; // -> 인덱스 위치
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
		int size = sc.nextInt();
		
		if(size < 3 || size % 2 == 0) {
			System.out.println("다시 입력하세요.");
			practice8();
		}else {
			int [] arr = new int[size];
			for(int index = 0; index <= size/2; index++) {
				arr[index] = 1 + index;
			}
			int value =1;
			for(int index = size/2+1; index < arr.length; index++) {
				arr[index] = size/2 + 1 - value; //내방식으로도 가능한지 보기
				value++;
			}
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", ")); //삼항연산자 복습하기!
			}
		}
//		int[] arr = new int[num];
//		
//		if(num % 2 == 1 && num >= 3) {
//			for(int i = 0; i <= num / 2; i++) {
//				if( i <= num / 2 ) {
//					arr[i] = i + 1;
//					System.out.print(arr[i] + ", ");
//				}else { // 이부분 식이 맞는 것 같은데 출력이 안되는 이유를 모르겠음...
//					arr[i] = (num - i);
//					System.out.print(arr[i] + ", ");
//				}
//			}
//		}else {
//			System.out.println("다시 입력하세요");
//			practice8();
//		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String[] chicken = {"양념", "간장", "후라이드"};
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(name)) {
				System.out.println(name + "치킨 배달 가능");
				return;
			}
		}
		System.out.println("치킨은 없는 메뉴입니다.");
		
//		int correct = 0;
//		for(int i = 0; i < 3; i++) { // 이부분 식이 맞는 것 같은데 출력이 안되는 이유를 모르겠음...
//			if(name.equals(chicken[i])) {
//				correct = i;
//				System.out.println(correct);
//				
//			}else {
//				System.out.println("no");
//			}
//		}
		
	}




}
