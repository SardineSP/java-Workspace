package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	double PI = Math.PI;
	
	public String calcArea(int x, int y, int radius) {
		return "면적 : " + c.toString() + " / " + (PI*radius*radius);
	}
	
	public String calcCircum(int x, int y, int radius) {
		return "둘레 : " + c.toString() + " / " + (PI*radius*2);
	}
	
}
