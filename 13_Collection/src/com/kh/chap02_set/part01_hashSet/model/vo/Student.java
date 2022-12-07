package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
//	@Override --> 이건 또 언제 썼대...?
//	public boolean equals(Object obj) { 비교할게 Student 클래스인 것을 알아도 자료형을 일치시켜줘야하므로?
//		//Student객체.equals(비교할 Student)
//	    //  this                    other
//		//	this => 현재 객체.
//		Student other = (Student) obj; --> 그래서 밑에서 다운캐스팅
//		if(this.age == other.age && this.score == other.score && this.name.equals(other.name)) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	// hashCode 메서드 재정의 : 필드값을 가지고 해시코드를 만들어서 반환하도록 재정의 -> 이부분 약간 모르겠음?
//	@Override
//	public int hashCode() {
//		String hash = name + age + score;
//		return hash.hashCode();
//	}

	@Override // 이하 자동완성
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	
}
