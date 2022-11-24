package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width); // 이부분이 값 초기화? 이게 없어서 값이 대입이 안됐었음 ㅋㅋㅋ
		return "면적 : " + r.toString() + " / " + (height*width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "둘레 : " + r.toString() + " / " + (2*(height+width));
	}
}
