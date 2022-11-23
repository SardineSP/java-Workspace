package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent(){ // 배열이 반환형
		return sArr;
	}
	
	public int sumScore() {
//		int sum = 0;
//		
//		for(int i = 0; i < sArr.length; i++) {
//			sum += sArr[i].getScore();
//		}
//		return sum;
//	}
		int sum = 0;
		for(Student std : sArr) { //반복하는 변수의 자료형을 그대로 사용하면 됨
			sum += std.getScore();
		}
		return sum;
	}	
		
	public double[] avgScore() {
		double [] avg = new double [2]; // 이거 new double[] 확인하기
		avg[0] = sumScore();
		avg[1] = sumScore()/sArr.length;
		
		return avg; // 이건 배열 리턴이라
	}
	
	

}
