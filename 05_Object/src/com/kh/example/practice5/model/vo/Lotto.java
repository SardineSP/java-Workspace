package com.kh.example.practice5.model.vo;

public class Lotto {
	private int [] lotto = new int [6];

	{	
		for(int i = 0; i < 6; i++) {
		lotto [i] = (int)((Math.random()*44)+ 1);
		}
	}

	public Lotto() {

	}

	public void information() { //중복 빼기
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
				return;
				}
			}
			System.out.print(lotto[i] + " ");
		}
	}
}
