package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Book bk1 = new Book();
//		bk.setTitle("설국"); -> 게터세터 없음!
//		bk.setPublisher("민음사");
//		bk.setAuthor("가와바타 야스나리");
//		bk.setPrice(10000);
//		bk.setDiscountRate(70.0);
		bk1.inform();
		
		Book bk2 = new Book("설국", "민음사", "가와바타 야스나리");
		bk2.inform();
		
		Book bk3 = new Book("영구평화론", "서울출판사", "임마누엘 칸트", 10000, 70.0);
		bk3.inform();
		
	}

}
