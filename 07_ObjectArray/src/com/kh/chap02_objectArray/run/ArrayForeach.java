package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForeach {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * 여태까지 사용했던 반복문 : for loop, 기본 반복문 //i 값이 필요할땐 기본 반복문 사용
		 * 새롭게 배울 반복문 : 향상된/개선된 for문
		 * 
		 * for each문(향상된 for문, 개선된 for문)
		 * 배열 또는 컬렉션과 사용됨
		 * 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근할 목적일때
		 * 
		 * 초기식 조건식 증감식 없음.
		 * 반복하는 회수는 배열 또는 컬렉션의 크기.
		 * 
		 * for(순차적으로 접근한 값을 담아줄 변수선언 : 순차적으로 접근할 배열/컬렉션){
		 * 	실행할 코드
		 * }
		 * 
		 */
		int[] arr2 = {40, 50, 60};
		
		for(int num : arr2 ) { 
			//arr2라는 배열은 0부터 순차적으로 접근하면서 int num이라는 변수에 arr2의
			//각 인덱스의 값을 저장함
			System.out.println(num);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("갤럭시", "z Flip3", "삼성", 100_0000);
		phones[1] = new Phone("갤럭시", "z Flip4", "삼성", 135_0000);
		phones[2] = new Phone("갤럭시", "fold4", "삼성", 200_0000);
		
		int sum = 0;
		
		for( Phone phone : phones ) {
			System.out.println(phone.information());
			sum += phone.getPrice();
		}
		
		System.out.println("총 합계 : " + sum);
		System.out.println("총 평균 : " + (sum/arr.length));
		
		// 사용자에게 구매하고자하는 폰의 시리즈를 입력받고
		// 구매하고자 하는 핸드폰이 phones배열에 있으면
		// "xx 핸드폰의 가격은 xxxx원입니다."
		// 구매하고자 하는 핸드폰이 없다면
		// "해당 핸드폰이 없습니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 핸드폰의 시리즈를 입력하세요 : ");
		String series = sc.nextLine();
		
		int count = 0;
		for(Phone phone : phones){		
			if(phone.getSeries().equals(series)) {
				count++;
				System.out.println(phone.getName() + phone.getSeries() + "핸드폰의 가격은 " + phone.getPrice() + "원입니다.");
				break;
			}
		}
		
		if(count == 0) {
			System.out.println("해당 핸드폰이 없습니다.");
		}
		
	}

}
