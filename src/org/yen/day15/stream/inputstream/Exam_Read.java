package org.yen.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
//		InputStream is = new InputStream(); 	//InputStream은 추상클래스이기 때문에 생성이 안됨. (x) 밑의 방식처럼 해줘야함.
		InputStream is = null;	// 이렇게 null 로 선언하고 생성은 FileInputStream 이용해서 한다.(15줄)
		// 예외처리해줘야한다. -> surround 하고 한번 더 예외처리
		int readByte;
		try {
			is = new FileInputStream("src\\org\\yen\\day15\\stream\\inputstream\\reading.txt"); //경로를 괄호안에 적어줌 
			do {
				readByte = is.read();
				System.out.println((char)readByte);	// (char)readByte를 통해 한글자씩 읽음.
			} while(readByte != -1);	
			// readByte가 -1 이 될 때까지 반복. -1이 되면 모든 값을 출력했다는 뜻임
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
}
