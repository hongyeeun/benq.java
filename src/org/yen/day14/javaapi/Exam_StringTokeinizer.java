package org.yen.day14.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokeinizer {
	public static void main(String[] args) {
		String query = "name=james&& addr = seulrange = 22";
		String words [] = query.split("&");
		for(String word : words) {
			System.out.println(word+" ");
		}
		System.out.println();

		StringTokenizer st = new StringTokenizer(query, "&");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
