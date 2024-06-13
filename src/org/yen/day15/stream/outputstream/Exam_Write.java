package org.yen.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/yen/day15/stream/outputstream/writing.txt");
			byte input [] = "헬로우 입출력".getBytes();	// getBytes를 이용하여 배열을 만들어줌.
//			os.write(input[0]);		
//			os.write(input[1]);
//			os.write(input[2]);
			// 이렇게 세개 하니까 '헬' 한 글자 보임.. 반복하면 다 보일듯!
			for(int i=0; i<input.length; i++) {
				os.write(input[i]);
			}
			os.flush();	// 버퍼비우기. 파일에 출력하기 전에 자료가 있는 공간을 비워 출력한다.
			os.close();	// 자원 해제
			System.out.println("파일 쓰기 완료");
//			"헬로우 입출력";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
