package com.kh.chap05_assist2.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ // 직렬화 선언 = implements Serializable 필수
	
	private String name;
	private int price;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
}
