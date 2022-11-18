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
	
//	public void getLotto(int lotto) {
//		this.lotto = lotto;
//	}
//	
//	public int getLotto() {
//		return lotto;
//	}
	

	public void information() { //중복 빼기
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
