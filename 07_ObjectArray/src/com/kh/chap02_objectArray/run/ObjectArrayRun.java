package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		arr[0].setSeries("12");
		arr[0].setBrand("애플");
		arr[0].setPrice(100_0000);
		
		arr[1] = new Phone("아이폰", "13", "애플", 150_0000); //이거 왜 null값이 나오지?
		arr[2] = new Phone("갤럭시", "Z Flip 4", "삼성", 135_0000);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
			sum += arr[i].getPrice();
		}
		
		System.out.println("총 가격 : " + sum + "원");
		System.out.println("평균 가격 : " + sum / arr.length + "원");
	}

}
