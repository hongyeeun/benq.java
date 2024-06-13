package org.yen.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/org/yen/day15/stream/writer/writing3.txt");
			writer.write("Html/Css/Java");	// 배열 없애고 문자 그대로 넣는다.
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
