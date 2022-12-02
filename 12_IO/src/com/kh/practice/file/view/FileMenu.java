package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;
import com.kh.practice.file.model.dao.FileDAO;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Menu *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine()); //예상치 못한 입력버퍼 오류를 방지 가능
			
			switch(num) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder(); // 객체 생성
		//sb.append("").append("").toString(); // 이걸로 입력한 문자열을 넣을 수 있음
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			
			if(str.equals("ex끝it")) {
				break;
			}
			sb.append(str + "\n"); // 이걸로 입력내용을 저장!!
		}
		
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String file = sc.nextLine();

			if(fc.checkName(file)) { // 이미 내용물이 true false라 조건식으로 쓸 필요가 없었음...
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				char ans = sc.nextLine().charAt(0);
				if(ans == 'y' || ans == 'Y') {
					//FileController(fc)에 fileSave()메서드로 파일명과 StringBuilder 넘김
					fc.fileSave(file, sb);
					
				}else if(ans == 'n' || ans == 'N') {
					System.out.println("파일명을 다시 입력해주세요.");
					continue; //왜?
				}
			}else {
				//파일명과 내용을 fc에 fileSave 메서드로 넘김
				fc.fileSave(file, sb);
			}
			break; //왜? 2
			
		}
		
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file)); // ?
		}else {
			System.out.println("없는 파일입니다.");
			//return; > 무한반복 돌고있으니 필요없음?
		}
	}
	
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) {
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str = sc.nextLine();
				
				if(str.equals("ex끝it")) {
					break;
				}
				sb.append(str + "\n");
			}
			fc.fileEdit(file, sb);
		}else {
			System.out.println("없는 파일입니다.");
			//return;
		}
	}

}
