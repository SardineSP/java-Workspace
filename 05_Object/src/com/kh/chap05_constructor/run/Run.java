package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserId("user01");
		user1.setUserPwd("1234");
		user1.setUserName("인은수");
		
		System.out.println(user1.information());
		
		//Scanner sc = new Scanner(System.in); //매개변수 있는 생성자
		User user2 = new User("user01", "pass01", "민영재"); //id, pwd, name
		
		System.out.println(user2.information());
		
	}

}
