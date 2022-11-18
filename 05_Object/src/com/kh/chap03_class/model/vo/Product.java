package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public, default
	// public으로 해야 다른 패키지에서 접근 가능
	// default로 설정한 경우 같은 패키지에서만 접근 가능. / 다른 패키지에서 접근 불가
	
	
	// 상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand = "애플";
	
	//setter메서드 3개
	public void setpName(String pName) { //private X
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter메서드 3개
	public void getpName(String pName) {
		this.pName = pName;
	}
	
	public void getPrice(int price) {
		this.price = price;
	}
	
	public void getBrand(String brand) {
		this.brand = brand;
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 반환해주는 information메서드
	public String information() {
		return pName + "의 가격은 " + price + "원이고, 브랜드명은 " + brand + "입니다.";
	}
	
	
}
