package org.yen.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Exam_FileCopy {
	public static void main(String[] args) {
		// C드라이브에 있는 파일을 E드라이브로 복사해보자.
		// C:\Temp\fetitlity.png -> D:\Copy\copied.png
		
		// InputStream과 OutputStream을 사용해야한다. (read와 write는 문자기반)
		// 1. 입력스트림과 출력스트림을 다 써야함.
		// 2. 바이트 기반 스트림 사용
		// - 바이트 배열 필요
		// 3. 자원해제
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Temp\\fetitlity.png");
			os = new FileOutputStream("D:\\Copy\\copied.png");
			int readCount;
			byte cBuf[] = new byte[1024];
			while((readCount = is.read(cBuf))!=-1) {
				os.write(cBuf, 0, readCount);
				os.flush();
			} 
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
