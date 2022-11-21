package com.kh.example.practice5.model.vo;

public class Lotto {
	private int [] lotto = new int [6];

	{	
		for(int i = 0; i < 6; i++) { // i<lotto.length -> length는 필드다?
		lotto [i] = (int)((Math.random()*45)+ 1); // 0.0<= x < 1.0 이므로 45를 곱하고 + 1??
			for(int j = 0; j < i; j++) {
				if(lotto [i] == lotto[j]) {
					lotto [i] = (int)((Math.random()*45)+ 1);;
				}
			}
		}
	}
	
//	for(int i = 0; i < lotto.length; i++) { 
//	int random = (int)((Math.random()*45)+ 1); 
//	lotto [i] = random;
//	for(int j = 0; j < i; j++) {
//			if(lotto [j] == random) {
//				i--; -> 하나 전으로 돌아가 다시 실행
//				break; -> 문제 없다면 여기서 종료...?
//			}
//	}

	public Lotto() {
		//사실 이 안에도 메서드가 기본 생성됨
		//super();
	}
	

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}


	public void information() { //이건 초기화필드 안에 넣어야하나?
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
			}
			//System.out.print(Arrays.toString(lotto)); -> 이것도 있었음...
	}

}
