package org.yen.day14.javaapi;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 10;
		num = 1023;
		if(num!=0) {}
		Integer su = null;
		//if(su! = null) {}
		su = Integer.valueOf(57);
		su = 1023;			// 오토-박싱 (auto-boxing)
		// 기본형 -> 객체형
		num = su.intValue();
		num = su;			// 오토-언박싱 (auto-unboxing)
		// 객체형 -> 기본형
		// int -> Integer
		// double -> Double
		// char -> Character
		// boolean -> Boolean
		// 문자열 -> 정수형 변환
		String openDay = "20240507";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		char c1 = '5', c2= 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1+" 은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+" 는 영문자");
		}
		// 나중에 유용하게 쓰임 !! 
		// ============= 문자열로 바꾸기 =============
		// 1. String.valueOf(1)
		// 2. +"" 붙이기
		// 3. .toString()
		System.out.println(String.valueOf(1));
		System.out.println(1+"");
		System.out.println(Integer.valueOf(1).toString());
	}

}
