package org.yen.day14.javaapi;

public class Exam_StringBuffer {

	public static void main(String[] args) {
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
		// 이렇게 하나씩 해도 됨
		//data1 = data1+ data2 + data3;
		// concat() 메소드 이용해서 연결
		data1 = data1.concat(data2).concat(data3);
		System.out.println("연결된 문자열 : "+data1);

		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문장려 : "+stb.toString());
	}
}
