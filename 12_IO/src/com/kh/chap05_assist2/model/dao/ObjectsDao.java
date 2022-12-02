package com.kh.chap05_assist2.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap05_assist2.model.vo.Phone;

public class ObjectsDao {

	public void fileSave(String fileName) {
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("아이폰", 1500000);
		arr[1] = new Phone("갤럭시", 1300000);
		arr[2] = new Phone("플립폰", 2000000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			for(int i = 0; i < arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneList.txt"))){
			
			while(true) {
				System.out.println(ois.readObject());
			}
			//EOFExeption 발생 : End Of File 약자.
			// IOExeption의 자식이기 때문에 다형성에 의해서 catch됨
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(EOFException e) { // 파일을 다 읽어서 에러가 나므로 추가?
			System.out.println("파일을 다 읽었습니다."); 
		}catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
