package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setGrade(5);
		student1.setClassroom(2);
		student1.setName("이규정");
		student1.setHeight(165);
		student1.setGender('M');
		
		System.out.println(student1.information());

	}

}
