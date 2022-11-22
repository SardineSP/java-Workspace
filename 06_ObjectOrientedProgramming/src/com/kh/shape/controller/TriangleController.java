package com.kh.shape.controller;

import com.kh.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width); //이부분 추가
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형 " + s.information();
	}

}
