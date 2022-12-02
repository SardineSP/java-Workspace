package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		return new File(file).isFile(); // File 메서드가 있었지...
		//true면 -> file임. 즉 생성되어있음.
	}
	
	public void fileSave(String file, String s) { // 이부분 다시보기
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){ //문자기반으로 사용해야함?
			bw.write(s); //여기서 \n 안하기위해 FileMenu에서 넣음
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String value = null; //이부분 뭘 활용한건지? 12:39
			while((value = br.readLine()) != null) {
				sb.append(value + "\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){ //이어서 작성 , true
			bw.write(s); //여기서 \n 안하기위해 FileMenu에서 넣음
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
