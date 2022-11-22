package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		//1. 기본생성자로 객체를 생성 후 setter 메서드를 통해 각 필드에 값 대입.
//		Book bk1 = new Book();
//		bk1.setTitle("호빗");
//		bk1.setAuthor("J.R.톨킨");
//		bk1.setPrice(20000);
//		bk1.setPublisher("황금가지");
//		
//		System.out.println(bk1.information());
//		
//		//2. 매개변수 생성자로 객체 생성과 동시에 각 필드에 값을 대입.
//		Book bk2 = new Book("서시", "윤동주", 16000, "나무");
//		
//		System.out.println(bk2.information());
//		
//		//3. 사용자가 입력한 값들로 객체 생성
//		//Book bk3 = new Book(제목, 저자, 가격, 출판사);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("저자 : ");
//		String author = sc.nextLine();
//		
//		System.out.print("가격 : ");
//		int price = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("출판사 : ");
//		String publisher = sc.nextLine();
//		
//		Book bk3 = new Book(title, author, price, publisher);
//		
//		System.out.println(bk3.information());
		
		// 세개의 Book객체가 필요하다는 가정하에 각각의 book 객체를 따로따로 관리
		//단, 사용자에게 입력받은 값들로 book 객체 채워놓기
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {// 1 2 3
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 1) {
				bk1 = new Book(title, author, price, publisher);	
			}else if(i ==2) {
				bk2 = new Book(title, author, price, publisher);	
			}else {
				bk3 = new Book(title, author, price, publisher);	
			}
		}
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
	}

}
