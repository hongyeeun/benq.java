package org.yen.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/yen/day15/stream/outputstream/writing2.txt");
			byte data[] = "한번 더 입출력".getBytes();
			os.write(data);	// 배열 뭉텅이를 넣어서 한번에 실행하기 
			// 앞의 것과 거의 동일하나 앞은 for문을 사용하였고, 이건 배열을 한꺼번에 넣음
			os.flush();	// 버퍼비우기
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
