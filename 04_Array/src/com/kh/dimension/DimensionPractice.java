package com.kh.dimension;

public class DimensionPractice {
	public void practice1() {
		String [][] arr = new String[3][3];
		
		String value = "";
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value = value + 1;
				System.out.printf("(%s, %s)\t", i, j);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int [][] arr = new int[4][4];
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value++;
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
				arr[i][j] = 16 - num;
				num++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
