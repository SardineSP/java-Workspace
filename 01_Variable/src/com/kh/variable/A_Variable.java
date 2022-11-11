package com.kh.variable;

// 시급과 근무시간과 근무일수를 곱해서 웗급을 계산하여 출력하는 메서드
public class A_Variable {

	public void printVariable() {
		
		System.out.println("변수 사용 전");
		
		System.out.println("시급 : 11000");
		System.out.println("근무시간 : 4");
		System.out.println("근무일 : 5");
		
		//월급 = 시급 x 근무시간 x 근무일
		//출력문 : 이규정 = 0000원 입니다.
		// * 은 곱셈을 나타내는 연산자이다.
		
		// 서로 다른 자료형 값 여러개를 출력문 하나에 동시 출력시 + 로 붙여줘야함.
		System.out.println("이규정 : " + (11000 * 4 * 5) + "원 입니다.");
		System.out.println("홍길동 : "+(11000 * 7 * 20)+"원 입니다.");
		System.out.println("고길동 : "+(11000*8*23)+"원 입니다.");
		
		System.out.println("변수 사용 후");
		
		int pay = 11000; // 자바에서 = 는 대입을 나타내는 연산자입니다. 같다는 == 를 사용함.
		int time = 7;
		int day = 15;
		
		System.out.println("시급 : "+pay);
		System.out.println("근무 시간 : "+time);
		System.out.println("근무일 : "+day);
		
		// 변수를 사용하여 월급 측정(시급 * 근무시간 * 근무일)
		
		System.out.println("이규정 : " + (pay*time*day) + "원 입니다.");
		System.out.println("홍길동 : " + (pay*time*day)+"원 입니다.");
		System.out.println("고길동 : " + (pay*time*(day+5)) + "원 입니다.");
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용(가독성이 좋음)
		 * 2. 단 한 번 값을 기록해두고 필요할 때마다 꺼내서 계속 사용할 목적으로 사용(재사용)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 */
	}
	
	//변수의 선언
	public void declareVariable() {
		
		/*
		 * 변수의 선언(값을 기록하기 위한 변수를 메모리 공간에 확보해두겠다 = 박스를 만들겠다)
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 따라서 변수의 크기 및 모양을 지정하는 부분.
		 * 변수명 : 변수의 이름을 정하는 부분.
		 * 
		 * 주의할 점
		 * 1. 변수명은 소문자로 시작하게끔 지어줄 것.(단, 낙타등표기법 "camel case" 지키기)
		 *     그밖에 언더스코어표기법 >> String user_name;
		 * ex) String userName; (0)
		 *     String username; (x)
		 * 2. 같은 영역 ({}) 안에서는 동일한 변수명으로 선언 불가
		 * 3. 해당 영역에 선언된 변수는 해당 영역 안에서만 사용 가능(다른 메서드에서는 불가능.)
		 *    => 지역변수라는 개념
		 */
		// ------자료형에 대한 개념-------
		// 1. 논리형(논리값 = true / false)
		boolean isTrue; //1byte
		
		// 2. 숫자형
		// 2_1 정수형
		byte bNum; //1byte(-128 ~ 127)
		short sNum; //2byte
		int iNum; //4byte(-21억 ~ 21억) => 정수형 중에 가장 대표적인 자료형(기본형)
		long lNum; //8byte
		
		//2_2. 실수형
		float fNum; //4byte => 소수점 아래 7자리가지 표현 가능.
		double dNum; //8byte => 소수점 아래 15자리까지 표현 가능. 실수형 중 가장 대표적인 자료형 => 보다 정확한 실수 값을 담을 수 있기 때문에.
		
		//3. 문자형
		char ch; //2byte;
		
		//---여기까지 총 8개의 자료형 : 기본자료형------
		
		//4. 문자열(참조형) => 나중에 좀 더 자세히 다를 예정, 자료형이자 클래스라 str. 하면 모든 클래스 사용 가능
		String str;
		
		//----------여기까지 총 9개 박스(변수)가 메모리 공간에 형성됨--------
		
		/*
		 * 변수에 값 대입 >> 초기화
		 * [표현법] 변수명 = 값(literal);
		 */
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; //long 자료형임을 알려주기 위해 소문자나 대문자 L을 표기해줌 (대문자 L을 더 권장)
		
		fNum = 4.0f; //반드시 f를 붙여줘야함 > 실수는 기본적으로 long으로 보기 때문?
		dNum = 8.0;
		
		ch = 'A'; //""이 들어가면 무조건 string으로 봄, 반드시 ''(작은 따옴표) 안에 넣어줘야함
		//또한 반드시 한글자짜리 문자로만 표시
		str = "스트링"; //반드시 ""(큰다옴표) 안에 넣어줘야한다.
		
		//각 변수에 담긴 값 출력
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
	}
	
	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 = 값(리터럴);
		 */
		//1. 논리형
		boolean isTrue = true;
	
		//2_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
	
		//2_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;
	
		//3. 문자형
		char ch = '이';
		//---여기가지가 프리미티브 타입----
	
		//4. 문자열(참조자료형) -- 레퍼런스타입?
		String str = "이규정";
	
	
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
	
		int longInteger = 999_999_999; // 보통은 999,999식으로 쓰지만 자바에서는 _를 씀
		System.out.println(longInteger);
	}
	
	public void constantVariable() { // 상수 constant, 값이 변하지 않는 수
		int age = 20;
		System.out.println("age : " + age);
		
		age = 25;
		System.out.println("변경된 age : " + age);
		
		final int AGE = 20; // final 을 붙여야 상수로 처리가 됨, 변수명은 전부다 대문자로
		System.out.println("상수 AGE : " + AGE);
		
		//AGE = 25;
		System.out.println("변경된 AGE : " + AGE);
	}
	
	
	
}


