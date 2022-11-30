package com.kh.chap04_date.run;

import java.text.*;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 *   java.util.Date 클래스
		 * - 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * - java 개발 초창기에 급하게 만들어서 완성도가 높지 않은 클래스(다국적으로 쓰기 적합하지 않음)
		 * 
		 * 
		 */
		
		// 기본생성자를 통해 Date객체 생성 => 현재 날짜 및 시간을 가지고옴.
		Date today = new Date(); //Date 클래스 안에 toString이 오버라이딩 되어있음
		System.out.println("기본생성자 : " + today);
		
		// 내가 원하는 날짜(2022년 11월 4일)
		// 방법 1. 매개변수 있는 Date클래스 생성자를 통해 변경
		//Date date1 = new Date(2022, 11, 4); // Deprecated : 권장하지 않음
		// 내부적으로 내가 전달할 연도 + 1900 => 세팅을 하고자하는 년도 - 1900
		// 내가 전달한 월 + 1 => 월 -1 (0~11)
		Date date1 = new Date(2022 - 1900,  11 - 1, 4, 15, 30, 0);
		System.out.println("매개변수 생성자 : " + date1);
		
		// "2022년 11월 4일 9시 0분 0초"
		// 내 입맛대로 포맷을 지정한 문자열을 받고자 할 때
		// java.text.SimpleDateFormat
		
		// 1. 형식을 지정하면서 SimpleDateFormat 객체 생성. %d %f %c %s 와 비슷 -> 굳이 외울 필요 없음, 검색!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. sdf객체에서 제공하는 format메서드 호출하면서 Date객체 전달 => 포맷에 지정한 형식대로 String문자열 반환
		//	  sdf.format(Date객체) : String
		String formatDate = sdf.format(date1);
		System.out.println(formatDate); // -> 왜 초수는 안나오지? 위에서 고정시켜서?
		
	}

}
