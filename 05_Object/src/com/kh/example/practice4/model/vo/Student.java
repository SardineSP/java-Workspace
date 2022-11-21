package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{ // 초기화 블럭 : 여기서 값을 대입
		grade = 5;
		classroom =9;
		name = "이규정";
		height = 163.6;
		gender = '남';
	} //static 초기화 블럭도 있음 -> static 변수 초기화할때 사용
	
	public Student() { //기본생성자
			
	}
		
//	public Student(int grade, int classroom, String name, double height, char gender) {
//		this.grade = grade;
//		this.classroom = classroom;
//		this.name = name;
//			
//	} => 기본생성자로 출력하랬으니 필요 없음... 애초에 없어도 출력됨
		
	
	public void setGrade(int grade) {
		this.grade = grade;	
	}
		
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
		
	public void setName(String name) {
		this.name = name;
	}
		
	public void setHeight(double height) {
		this.height = height;
	}
		
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() { //void가 아닌 것들은 반드시 return으로 돌려줄 값을 작성해야함
		return grade;	
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void information() { //문제에서 반환형 void, 매개변수도 없게 작성하라고 했으므로 안에 print문을 작성
		System.out.println(grade + "학년 " + classroom + "반 " + name + "학생, 키는" + height + "cm이며 " + gender + "자입니다.");
	}

}


