package com.kh.dimension;

import java.util.Scanner;
import com.kh.practice.run.*;

public class DimensionPractice {
	public void practice1() {
		String [][] arr = new String[3][3];
		
		String value = "";
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = value; // 이미 행열 정보는 i, j가 가지고 있음!
//				value = value + 1;
				System.out.printf("(%d, %d)\t", i, j);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int [][] arr = new int[4][4];
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int [][] arr = new int[4][4];
		
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 16 - num++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() { ///???????
		int [][] arr = new int [4][4];
		
		int sum = 0;
		for(int i = 0; i < arr.length -1 ; i++) {
			for(int j = 0; j < arr[i].length -1; j++) {
				arr[i][j] = (int)((Math.random()*10)+1) ;
				
				arr[i][3] += arr[i][j]; //각 행의 모든 값의 합
				arr[3][j] += arr[i][j]; //각 열의 모든 값의 합
				arr[3][3] += arr[i][j]*2; //가로세로의 총합
			}
		
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(i < 3 && j < 2) {
//					arr[i][j] = (int)((Math.random()*10)+1) ;
//					sum += arr[i][j] ;
//				}
//				if(i == 3) {
//					for(j = 0; j <arr[3].length; j++) {
//						arr[3][j] = sum; 
//					}
//				}
//				
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.printf("%3d", arr[i][j]);
//			}
//			System.out.println();
		}
		printArray(arr);
		
	}
	public void printArray(int[][] arr) { // 출력을 메서드? 화?
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	
	}

	public void practice5() { // 이거 다른 풀이는 꼭 코드 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int column = sc.nextInt();
		
		char ch;
		
		if(row >= 1 && row <=10 && column >= 1 && column <=10) {
			char [][] arr = new char[row][column];
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < column; j++) {
						ch = (char)((Math.random()*(26))+ 65);
						arr[i][j] = ch;
						System.out.printf("%2c", arr[i][j]);
					}
				System.out.println();
				}
		}else {
			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.\n");
			practice5();
		}
	}
	
	public void practice6() { //이것도 약간 다른듯?
		String [][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"}, 
			{"열", "히", "! ", "더", "!! "}};
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			
		}
	}
	
	public void practice7() { //////// 이것도 약간 다르니 참고, 좀 더 이해 되도록 파악해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		

		char [][] arr = new char[row][];
		
		char ch = 'a';
			
		for(int i = 0; i < row; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			int column = sc.nextInt();
			
			arr[i] = new char[column]; 
			for(int j = 0; j < column; j++) {
				arr[i][j] = ch;
				if(ch == 'z') { // 이처럼 범위 지정해줌
					ch = 'a';
				}else {
				ch++;
				}
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String [] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String [][] desk1 = new String[3][2];
		String [][] desk2 = new String[3][2];
		
		int num = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < desk1.length; i++) {
			for(int j = 0; j < desk1[i].length; j++) {
				desk1[i][j] = students[num++];
				//num++;
				System.out.print(desk1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i = 0; i < desk2.length; i++) {
			for(int j = 0; j < desk2[i].length; j++) {
				desk2[i][j] = students[num++];
				//num++;
				System.out.print(desk2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() { // 이것도 파일 꼭 확인하기
		String [] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String [][] desk1 = new String[3][2];
		String [][] desk2 = new String[3][2];
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		practice8();
		
		System.out.println("========================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String rl;
		
		//char [] line = {'첫', '두', '세'}
		for(int i = 0; i < desk1.length; i++) {
			for(int j = 0; j < desk1[i].length; j++) {
				if(name.equals(desk1[i][j])) {
					if(i == 0) {
						rl = "첫";
					}if(i == 1) {
						rl = "두";
					}else {
						rl = "세";
					}
					System.out.printf("검색하신 %s 학생은 1분단 %s 번째 줄 %s쪽에 있습니다.",name, rl, (j == 1? "오른" : "왼")); 
					// 위의 line[i] 활용도 가능
					continue;
				}
			}
		}
		
		for(int i = 0; i < desk2.length; i++) {
			for(int j = 0; j < desk2[i].length; j++) {
				if(name.equals(desk2[i][j])) {
					if(i == 0) {
						rl = "첫";
					}if(i == 1) {
						rl = "두";
					}else {
						rl = "세";
					}
					System.out.printf("검색하신 %s 학생은 2분단 %s 번째 줄 %s쪽에 있습니다.",name, rl, (j == 1? "오른" : "왼"));
				}
			}
		}
		
		
	}

}
