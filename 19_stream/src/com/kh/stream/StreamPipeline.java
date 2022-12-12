package com.kh.stream;

import java.util.ArrayList;

public class StreamPipeline {

	/*
	 * PipeLine
	 * 데이터의 처리결과가 다음 단계의 데이터처리에 사용되며 
	 * 또 다음 데이터처리에 사용되는 연속적인 처리구조를 의미함
	 * 
	 * 파이프라인은 여러개의 스트림을 "연결"하여 사용하는데 
	 * 중간처리 스트림n개 + 최종처리 스트림 1개로 구성됨.
	 * 
	 * 중간처리 스트림역할 : 필요한 데이터검색 및 필터링, 형변환 등등(Filter, map, sort, ...)
	 * 최종처리 스트림 역할 : 중간처리스트림의 값을 토대로 결과값 반환(sum, min, ...)
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시", 1350000, 55 ,"삼성"));
		pList.add(new Product("모토로라", 500000, 3,"모토로라"));
		pList.add(new Product("블랙베리", 600000, 10,"블랙베리"));
		pList.add(new Product("아이폰", 1250000, 60,"애플"));
		pList.add(new Product("애니콜", 100000, 15,"애니콜"));
		
		//삼성제품의 평균가격 구하기.
		//Stream<Product> avgPrice = pList.stream(); --> 전에 했던 방법.
		double avgPrice = pList.stream().
				//pList에서 브랜드명이 삼성인 요소만 남김
				filter(product -> product.getBrand().equals("삼성")).
				//현재 스트림요소(Product)에서 제품의 가격에 대한 값으로 데이터를 변경
				mapToInt(product -> product.getPrice()).
				average().
				getAsDouble(); // 결과값 반환
		
		System.out.println("삼성폰 평균 가격은?" + avgPrice + "만원입니다.");
		
		// :: 더블콜론.
		/*
		 * 람다식을 더욱 간결하게 표현해주는 방법
		 * 람다표현식이 단 하나의 메서드만 참조하는 경우, 매개변수를 제거해서 사용할 수 있도록 함
		 * 
		 * [표현법]
		 * 클래스이름 or 변수이름 :: 메서드이름
		 * 
		 */
		
		pList.stream()
		//.mapToInt(product -> product.getPrice())
		.mapToInt(Product :: getPrice) // 클래스이름 :: 메서드이름
		//.forEach(price -> System.out.println(price));
		.forEach(System.out :: println); // 클래스이름 :: 메서드이름
		
		
	}

}
