package com.kh.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {
	public String charge(); //충전방식
}
