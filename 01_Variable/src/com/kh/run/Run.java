package com.kh.run;

import com.kh.variable.*; // * 은 저 안에 있는 모든 작업파일을 import 해온다는 의미, 하지만 타겟만 딱 하는걸 권장

public class Run {
	
	public static void main(String[] args) {
		A_Variable av = new A_Variable();
		// av.printVariable();	
		//av.declareVariable();
		//av.initVariable();
		//av.constantVariable();
		
		B_KeyboardInput bk = new B_KeyboardInput();
		//bk.inputTest1();
		//bk.inputTest2(); // println문과 달리 바로바로 밑줄에 출력됨
		
		C_Cast cc = new C_Cast();
		//cc.autoCasting();
		//cc.forceCasting();
		
		D_Printf dp = new D_Printf();
		dp.printFtest();
		
	}

}
