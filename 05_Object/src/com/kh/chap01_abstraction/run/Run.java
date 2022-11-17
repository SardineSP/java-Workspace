package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class Run {
	/*
	 * 1. 객체지향언어 : "객체"를 "지향"하는 언어로 객체중심으로 돌아가는 언어
	 * 
	 * 2. 객체란? 사전적 의미로는 현실세계에 독립적으로 존재하는 모든것을 의미
	 * 
	 * 3. 객체지향 프로그래밍 : 현실세계의 객체간의 상호작용(행위)를 프로그래밍을 통해 가상세계로 구현하는 과정
	 * 
	 * 4. 구현하고자하는 프로그램상의 필요한 객체를 만들기 위해서(생성하기위해서)는 클래스라는 틀을 먼저 만들어야함
	 * 	=> 클래스란? 각 객체들의 속성(정보)들을 담아낼 수 있는 그릇과도 같은 존재
	 *  => 추상화와 캡슐화과정을 거쳐 클래스를 만들 수 있음.
	 *  
	 *  
	 * 5. 추상화 과정
	 *  	1) 내가 구현하고자하는 프로그램에서 필요한 객체들을 생각해볼것 ex) 학생관리 프로그램 -> '학생'객체 : A 학생 B 학생 등등
	 *  	2) 그 객체들이 가지고있는 공통적인 속성, 기능들을 모두 추출할 것 ex) 이름, 나이, 성별, 주소, 키 등등...
	 *  	3) 그렇게 추려진 속성들을 가지고 내가 구현한 프로그램의 "실질적인 목적"에 맞춰서 불필요한 속성과 기능들을 제거하기
	 *  	4) 최종적으로 추려진 속성 및 기능을 가지고 어떤 자료형에 어떤 이름으로 사용할 것인지 생각해보기
	 *  
	 *  	예) 학생관련 프로그램
	 *  		1) 학생 관련 객체(A 학생, B학생 등등)
	 *  		2) 공통적인 속성 및 기능들(이름, 나이, 성별, 주소, 전화번호, 키, 달리기속도, 학년, 반, 점수, 몸무게 등등)
	 *  		3) 만약 학생 "인적사항"을 관리하는 프로그램이라면? 이름, 나이, 성별, 주소, 전화번호, 학년, 반만 추려낸다.
	 *  		   만약 학생 "성적"을 관리하는 프로그램이라면? 이름, 학년, 반, 점수만 추려낸다.
	 *  		   만약 학생 "건강"을 관리하는 프로그램이라면? 이름, 키, 학년, 반, 몸무게만 추려낸다.
	 *  		4) 이름 => String name;
	 *  		   나이 => int age;
	 *  		   키 => double height;
	 *  
	 * 6. 위의 선정된 것들을 가지고 본격적인 프로그래밍을 할 것.
	 * 		1) "변수"만을 가지고 프로그래밍을 하게된다면?
	 * 			변수 : 하나의 자료형으로 하나의 값만 보관할 수 있음
	 * 			A 학생이라는 객체를 만들기 위해선 => String name1 = "A 학생", int age1 = 20; double height1 = 168.7;
	 * 									  => ...
	 * 
	 * 			=> 관리하고자 하는 학생들이 늘어나면 늘어날수록 생성해야할 갯수도 엄청나게 증가하게됨. 즉 관리하기가 굉장히 힘듬
	 * 		2) "배열"을 이용해서 프로그래밍을 하게된다면?
	 * 			배열 : 하나의 자료형인 여러개의 값들을 보관할 수 있음. (단, 동일한 자료형일시)
	 * 			학생들의 이름을 보관하는 배열 선언 => String [] name = {"A 학생", "B 학생", ...};
	 * 			학생들의 나이를 보관하는 배열 선언 => int [] age = {20, 30, 40};
	 * 			학생들의 키를 보관하는 배열 선언  => double [] height = {123.4, 137.5, ...};
	 *			=>변수를 사용하는 것보다는 나아보임.
	 *			=> 하지만 관리하는 학생 중 한 명이 전학을 가게되는 경우 해당 인덱스에 있는 모든 키, 나이에 대한 정보도 제거를 해줘야함.
	 *				그리고 새로운 학생이 들어오게되는 경우 배열의 특성상 한번 크기를 지정하게되면 변경하는게 불가능하므로, 새로운 정보를 입력하기 위해 배열을 복사해서 새롭게 추가해야함. 즉, 유지보수가 힘듬.
	 *
	 * 		3) "클래스(구조체)"를 가지고 프로그래밍한다면
	 * 			구조체 : 한 번에 여러개의 자료형을 보관할 수 있는 배열같은 형태.
	 * 			String값도 보관하고, int값도 보관하고, double값도 보관할 수 있는 나만의 자료형을 만들 수 있음.
	 * 			클래스 : 각 객체들의 속성 정보들을 담아내는 그릇과도 같은 존재. 보통 vo패키지 안에 보관한다.
	 * 
	 * 			public class Student{
	 * 				String name = "이규정";
	 * 				int age = 26;
	 * 				double height = 163.6;
	 * 			}
	 */
	
	//Student클래스 생성해보기

	public static void main(String[] args) {
		//1. Student 클래스 만들고 나서 객체 생성.
		// A 학생 객체 만들기
		Student A = new Student(); //객체를 생성(메모리영역에 객체의 공간이 할당됨)
		//직접적으로 접근해서 값 대입
		A.name = "A 학생";
		A.age = 20;
		A.height = 163.6; //필드 접근하고자 한다면 .을 통해 가져올 수 있음(단, 접근제한자가 public인 경우)

		//이규정 학생 객체 만들기
		Student jung = new Student();
		jung.name = "이규정";
		jung.age = 21;
		jung.height = 163.6;
		
		System.out.println(jung);
		System.out.println(A);
		
		
		// xxx님의 나이는 xx살이고, 키는 xx.xcm입니다.
		System.out.println(A.name + "님의 나이는 " + A.age + "살이고, 키는 " + A.height + "cm입니다.");
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm입니다.", A.name, A.age, A.height);
		
		/*
		 * 필드 public으로 작성시 
		 * => 직접적으로 접근해서 값 대입 및 조회할 경우 보안문제가 생길 수 있다.
		 * => 외부에서 함부로 값을 변질시키거나 조회권한이 없는 사람이 값을 쉽게 가져올 수 있는 문제 발생
		 * >>> 캡슐화로 해결
		 * 객체지향의 설계원칙중 하나가 바로 정보은닉이며 그 기술 중 하나가 바로 캡슐화
		 * 
		 * 
		 */
	}

}
