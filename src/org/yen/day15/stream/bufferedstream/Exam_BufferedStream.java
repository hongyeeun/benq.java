package org.yen.day15.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

// 보조스트림을 이용하여 읽는 방법 (BufferedReader)
public class Exam_BufferedStream {

	public static void main(String[] args) {
		Reader reader = null;		// 문자기반
//		InputStream is = null;		// 바이트기반 (이미지, 동영상)
		BufferedReader bReader = null;
		int readCount;
		try {
			reader = new FileReader("src/org/yen/day15/stream/bufferedstream/Exam_BufferedStream.java");
			bReader = new BufferedReader(reader);	// 보조스트림 안에 주스트림을 넣어서 쓴다.
			char cBuf[] = new char[1024];
			readCount = bReader.read(cBuf);	// 보조스트림 bReader의 메소드(read) 를 사용한다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
