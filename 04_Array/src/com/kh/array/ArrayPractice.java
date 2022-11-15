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

}
