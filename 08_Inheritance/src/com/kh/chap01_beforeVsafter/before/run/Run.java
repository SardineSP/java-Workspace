package com.kh.chap01_beforeVsafter.before.run;

import com.kh.chap01_beforeVsafter.before.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// 데스크탑 객체
		//brand, pCode, pName, price, allInOne
		DeskTop d = new DeskTop("삼성", "d-01", "삼성 데스크탑", 1_500_000, true);
		
		// 스마트폰 객체
		//brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰14", 1_400_000, "LG");
		
		// TV 객체
		//brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-01", "얇은티비", 3_500_000, 60);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * 매 클래스마다 중복된 코드들을 일일이 기술해두게 되면
		 * 수정과 같은 유지보수시 매번 일일이 찾아서 수정해야하는 번거로움이 생김
		 * 
		 * ex) 필드명 수정, 새로운 필드 추가시
		 * 
		 * 상속이라는 개념을 적용시켜서 매 클래스마다 "중복된" 필드, 메서드들을 
		 * 단 한번 또하나의 클래스(부모클래스)에 정의해둔 후 
		 * 해당 클래스를 상속받아서 부모클래스의 필드와 메서드를 가져다 쓰는 방식으로
		 * 코드의 중복을 피해야한다.
		 * 
		 */
	}

}
