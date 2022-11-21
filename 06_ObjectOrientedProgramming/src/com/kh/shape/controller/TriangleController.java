package com.kh.shape.controller;

import com.kh.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		return height * width;
	}
	
	public void paintclor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return s.getType() + s.information();
	}

}
