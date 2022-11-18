package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setpName("아이폰 14");
		p1.setPrice(1_400_000);
		//p1.setBrand("애플"); // brand필드에 "애플"로 값이 이미 초기화되어있어서, brand명 지정시 애플상품이라면 초기화하지 않아도 됨.
		
		System.out.println(p1.information());
		
		Product p2 = new Product();
		
		p2.setpName("갤럭시 z플립 4");
		p2.setPrice(1_350_000);
		p2.setBrand("삼성");
		
		System.out.println(p2.information());
		
		
		Member m1 = new Member();
		m1.changeName("이규정");
		m1.printName();
		
		Scanner sc = new Scanner(System.in);
		Math.random(); // 위와 달리 import도 없이 바로 사용 가능 - static변수
	}

}
