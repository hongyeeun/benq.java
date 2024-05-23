package org.yen.day05.exception.exercise;

public class Exercise_Exception4 {
	public static void main(String[] args) {
		// 문제 4
		// 문자열을 정수로 변환할 때
		// 발생하는 NumberFormatException을
		// 처리하는 프로그램을 작성하라.
		String words[]= {"507","10.23", "" };
		//String -> int
		try {
			int result = Integer.parseInt(words[0]);
			System.out.println(result);
			int result2= Integer.parseInt(words[1]); //10.23은 정수로 못바꿈
			System.out.println(result2);	//오류남
			int result3 = Integer.parseInt(words[2]);
		} catch(NumberFormatException e){
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}
	}
}
