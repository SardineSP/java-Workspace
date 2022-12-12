package com.kh.test.movie.run;

import com.kh.test.movie.model.vo.Movie;

public class Run {

	public static void main(String[] args) {
		Movie User = new Movie("스타워즈", "조지 루카스", "마크 해밀", "SF", 2, false);
		User.print();
		
	}

}
