package com.kh.example.practice3.model.vo;

public class Circle {
	//필드부
	private static final double PI = 3.14;
	private int radius = 1;
	
//	{ // 이 괄호가 초기화 블럭
//		radius = 5;
//	}
	
	//생성자부
	public Circle() {
		
	}
	
	//메서드부 (static은 게터 세터를 못만듦)
	
	public void setRadius(int radius) {
		this.radius = radius;	
	}
	
	public int getRadius() {
		return radius;	
	}
	
	public void incrementRadius() { //괄호 안 비우기?
		radius++;
	}
	
	// 원의 둘레
	public void getAreaOfCircle() {
		System.out.println(radius * 2 * PI); //출력하랬으니 여기다 넣기?
	}
	
	//원의 넓이
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}
	
}
