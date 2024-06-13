package org.yen.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;	// 최상위 클래스이고 추상클래스이므로 new로 생성불가능
		try {
			reader = new FileReader("src/org/yen/day15/stream/reader/reading.txt");
			int readData;	// 한글자씩 읽어 줄 것이라, int로 readData 선언
			while((readData = reader.read())!= -1) {
				// readData가 -1이 아닐 때 까지 반복한다. (한글자씩 읽고 없으면 그만)
				System.out.println((char)readData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
