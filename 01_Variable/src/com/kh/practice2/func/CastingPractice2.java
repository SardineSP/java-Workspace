package com.kh.practice2.func;

public class CastingPractice2 {
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum =2.5;
		
		char ch = 'A';
		
		System.out.println((int)dNum);
		//System.out.println(iNum1 / iNum2);
		System.out.println(iNum2 - (int)dNum);
		
		//System.out.println(iNum2 * dNum);
		System.out.println((float) iNum1); //double로!
		System.out.println((float)(iNum2 + (int)(fNum + fNum)));
		
		//System.out.println(iNum1 / (double)iNum2);
		System.out.println((double)dNum); // 그냥 출력해도 됨! double 안붙이고
		System.out.println((float)dNum);
		
		System.out.println((int)fNum);
		//System.out.println(iNum1/(int)fNum);
		System.out.println(iNum1 - (iNum2 + (int)fNum));
		
		System.out.println((float)(iNum1/fNum)); //알아서 iNum1이 변환되므로 float 필요없음....
		System.out.println((double)iNum1 / fNum); //하나만 double로 만들면 되네... 순서 중요 연산 전에!
		
		System.out.println((char)ch); //그냥 출력해도 됨...
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1); //(int) 없어도 됨...
		System.out.println((char)(ch+iNum1));
	}

}
