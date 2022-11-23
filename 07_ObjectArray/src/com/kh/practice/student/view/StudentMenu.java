package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {	
	
	Student st = new Student();
	private StudentController ssm = new StudentController();
	
	public StudentMenu() { // -> 메서드가 아님
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sArr = ssm.printStudent(); //좌측이 저장할 곳
		
//		for(int i = 0; i < 5; i++) { -> 이거 되나?
//			System.out.println(sArr);
//		}
		
		for(Student std : sArr) { // 이부분 이해 안감, 왜 또 주소값으로 나오냐...
			System.out.println(std.inform()); // -> inform으로!
		}
		
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int) avg[0]);
		System.out.println("학생 점수 평균 : " + avg[1]);
		
//		System.out.println(ssm.sumScore());
//		System.out.println(ssm.avgScore());
		
		System.out.println("========== 성적 결과 출력 ==========");
		
		for(Student std : sArr) {
			String result = "통과";
			if(std.getScore() < StudentController.CUT_LINE) {
				result = "재시험 대상";
			}
			System.out.printf("%s 학생은 %s입니다.\n", std.getName(), result);
		}
//		if(st.getScore() < sc.CUT_LINE) {
//			System.out.println("재시험 대상");
//		}else {
//			System.out.println("통과");
//		}
	}	
}
