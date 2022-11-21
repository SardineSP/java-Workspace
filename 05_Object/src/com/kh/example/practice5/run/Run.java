package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		Lotto lt = new Lotto(); //객체 안에는 이미 필드나 메서드가 담겨있으므로 굳이 변수에 주소값을 담아줄 필요가 없음
		lt.information();
		//new Lotto().information(); -> 이것도 가능
	}

}
