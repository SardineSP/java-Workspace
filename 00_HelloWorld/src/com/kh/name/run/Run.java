package com.kh.name.run;

import com.kh.name.MyName; //가져온다는 의미, 위치까지 같이 써줘야함 패키지 + 클래스 = 풀네임

public class Run {
	
	public static void main(String [] args) {
		//mn은 변수명, 별명        클래스를 다른 클래스에서 가져다쓰기
		MyName mn = new MyName();
		
		//"위치."와 같이 써주기, 실행을 위해서는 항상 ()로 감싸줘야함
		mn.callMyName();
	}

}
