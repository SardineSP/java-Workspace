package com.kh.chap02_abstractNInterface.model.vo;

public interface Phone{
	
	public char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	public String makeCall(); // 전화걸기
	public String takeCall(); // 전화받기
}
