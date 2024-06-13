package org.yen.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src\\org\\yen\\day15\\stream\\inputstream\\reading.txt");
			byte[] readBytes = new byte[3];	// 3개씩 읽는 것이다.
			int readCount;
			String result="";
			// do
			while(true) {
				readCount = is.read(readBytes);	// readCount는 읽은 갯수
				if(readCount == -1) break;
				result += new String(readBytes, 0, readCount); 	// new String을 통해 문자열을 하나로
			} 
			// while(readCount != -1);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
