package com.kh.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod {

	public static void main(String[] args) {
		// stream에서 원하는 값을 얻어내기위한 메서드들.
		
		// 1) filter: 조건에 맞는 값만 추려주는 메서드
		String [] foods = {"마라탕", "마라탕", "김치찜", "삼겹살", "하와이안피자", "김밥", "짬뽕"};
		
		// 음식이름이 "마"로 시작하는 음식만 추리기.
		Arrays.stream(foods)
			.filter(food -> food.charAt(0) == '마')
			.forEach(System.out :: println); // forEach( food -> System.out.prinln(food))

		System.out.println("===== 중복값 제거 =====");
		
		// 2) distinct() : 중복값을 제거해주는 메서드
		List<String> arr = Arrays.asList(foods);
		
		arr.stream()
			.distinct()
			.filter(food -> food.charAt(0) == '마')
			.forEach(System.out :: println);
		
		// 3) map관련 메서드들.
		// 3_1) mapXXX : 현재 요소를 XXX로 대체하여 스트림 반환 
		System.out.println("----- 맵 -----");
		
		arr.stream()
			.map(food -> {
				if(food.equals("삼겹살")) {
					return food + " 맛있다.";
				}else {
					return food + " 맛없다.";
				}
			})
			.forEach(System.out :: println);
		
		System.out.println("========");
		
		String[] strArr = {"마라탕 훠궈 양꼬치 김밥", "하하 호호"};
		
		// 3_2) flatMapxxx : 특정요소가 여러개의 요소로 대체되는 스트림 반환.
		List<String> arr2 = Arrays.asList(strArr); // ["마라탕 훠궈 양꼬치 김밥"]["하하 호호" ]
		
		// 스페이스 기준으로 각각의 요리를 String 요소로 만들기
		arr2.stream()
			.flatMap(food -> Arrays.stream(food.split(" ")))
			.forEach(System.out :: println);
	}
	
	

}
