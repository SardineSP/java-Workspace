package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
//		student1.setGrade(5); -> 문제에서 초기화블럭에서 초기화를 하라고 했으므로 필요없음...
//		student1.setClassroom(2);
//		student1.setName("이규정");
//		student1.setHeight(165);
//		student1.setGender('남');
		
		student1.information();

	}

}
