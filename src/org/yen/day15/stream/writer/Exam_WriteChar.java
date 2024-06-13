package org.yen.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/org/yen/day15/stream/writer/writing2.txt");
			char data[] = "Html/Css/Java".toCharArray();
			writer.write(data);	// for문 없애고 배열 그대로 넣기
			writer.flush(); 
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
