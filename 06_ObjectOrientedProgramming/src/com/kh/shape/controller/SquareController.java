package com.kh.shape.controller;

import com.kh.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(?, height, width); // 이거 추가?
		return width*2 + height*2;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(?, height, width); // 이거 추가?
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 " + s.information(); //square 안이라 사각형으로 명기
	}

}
