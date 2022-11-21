package com.kh.shape.controller;

import com.kh.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		return height*2 + width*2;
	}
	
	public double calcArea(double height, double width) {
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return s.getType() + s.information();
	}

}
