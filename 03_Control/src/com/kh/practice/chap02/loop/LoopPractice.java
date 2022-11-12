package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요");
			practice1();
		}
	}
	
	public void practice2() { //이건 왜 안될까? 거꾸로 출력은....
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 0; i < num; i++) {
				System.out.print((num-i) + " ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요");
			practice2();
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하게요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
				System.out.print(i + " + ");
				sum = num + i; // 되긴 했는데 왜 이게 num + i가 될까????
		}
		System.out.print(" = " + sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) { // 좀 더 간소화 할 수 있을 것 같은데...
			if(num1 >= num2){
				for(int i = num2 + 1; i < num1; i++) {
					System.out.print(i + " ");
				}
			}else {
				for(int i = num1 + 1; i < num2; i++) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.print("1 이상의 숫자를 입력해주세요");
			practice4();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan <= 9) {
			for(int i = dan; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, (i*j));
				}
				System.out.println();
			}
		}else {
				System.out.print("9 이하의 숫자를 입력해주세요");
				practice5();
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int blank = sc.nextInt();
		
		int sum = start;
		
		for(int i = 1; i <= 10; i ++) {
			System.out.print(sum + " ");
			sum = start + (blank*i);
		}
				
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
				
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
				
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
				
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
				
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
				
	}
	
}
