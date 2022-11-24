package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.DeskTop;
import com.kh.chap01_beforeVsafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.after.model.vo.Tv;

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

	}

}
