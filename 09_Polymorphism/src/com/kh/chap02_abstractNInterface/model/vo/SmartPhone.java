package com.kh.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker; // 제조사 정보
	
	public SmartPhone() {
		
	}
	
	public abstract String printInformation();//기울어진 글꼴 -> 추상메서드 abstract
	
	public void setMaker(String maker) { //set, get 다시 보기
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
}
