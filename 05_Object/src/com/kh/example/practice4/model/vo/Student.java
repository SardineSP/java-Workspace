package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 0;
		classroom = 0;
		name = "";
		height = 0.0;
		gender = 0;
	}
	
	public Student() {
			
	}
		
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
			
	}
		
	
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
	
	public int getGrade() {
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
	
	public String information() {
		return grade + "학년 " + classroom + "반 " + name + "학생, 키는" + height + "cm이며 " + gender;
	}

}


