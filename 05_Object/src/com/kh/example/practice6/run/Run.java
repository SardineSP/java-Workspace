package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Book bk = new Book();
		bk.setTitle("설국");
		bk.setPublisher("민음사");
		bk.setAuthor("가와바타 야스나리");
		bk.setPrice(10000);
		bk.setDiscountRate(70.0);
		
		System.out.println(bk.inform());
	}

}
