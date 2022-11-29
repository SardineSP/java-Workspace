package com.kh.chap02_string.controller;
	
	// String은 불변클래스(변하지 않는 클래스)
	// 수정하는 순간 기존의 값이 담겨있는 공간에서 수정되지 않음.
public class A_StringPoolTest {

	// 생성자를 통해 문자열 담기
	public void method1() {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2); // false => 주소값을 비교하고 있기 때문
		System.out.println(str1);
		System.out.println(str2.toString());
		//String클래스의 toString()메서드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음.
		
		System.out.println(str1.equals(str2)); // true => 문자열을 비교하고 있기 때문에
		//String 클래스의 equals() 메서드의 경우 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되어있음.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 클래스의 hashCode()메서드의 경우 주소값 기반이 아닌 실제 담긴 문자열 기반으로 해시코드값을 반환하도록 오버라이딩 되어있음
		
		//정말 주소값을 알고싶을때 사용하는 메서드 System.identityHashCode(참조변수(레퍼런스변수))
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	// 2. 문자열을 리터럴(값)로 생성
	public void method2() {
		
		String str = new String("Hello");
		
		//리터럴값이 상수풀에 올라감.
		String str1 = "Hello";
		String str2 = "Hello";
		
		//StringPool : 동일한 문자열 존재 불가
		System.out.println(str1 == str2); //true(주소값이 일치한다)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	//불변클래스
	public void method3() {
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc"; // str = str + "abc"
		System.out.println(System.identityHashCode(str));
	}
	
	
	
	
	
	
	
}
