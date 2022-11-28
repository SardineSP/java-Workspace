package com.kh.chap01_poly.part02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports{

	/*
	 * 미완성된 클래스인 추상클래스를 상속받게되면, 부모클래스에 있는 추상메서드(하기 rule();)를 강제로 오버라이딩 해줘서 완성시켜야함.
	 */
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 던져 링에 넣으면 된다.");
	}
}
