package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle cc = new Circle();
		cc.getAreaOfCircle(); 
		cc.getSizeOfCircle();
		cc.incrementRadius();
		
		cc.getAreaOfCircle(); // 이걸 생성자 안에 넣으면 자동으로 진행됨
		cc.getSizeOfCircle();
		
//		System.out.println(cc.getAreaOfCircle()); 
//		System.out.println(cc.getSizeOfCircle());
	}

}
