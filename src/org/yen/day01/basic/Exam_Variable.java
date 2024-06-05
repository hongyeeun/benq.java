package org.yen.day01.basic;

public class Exam_Variable {
	public static void main(String [] args) {
		/*
		 * 숫자(정수,실수), 문자, 문자열
		 * 자바는 타입을 정해놓고 정해진 데이터로 초기화해야함.
		 * 다르면 Type mismatch : cannot convert from A to B.
		 */
		int a = 3;
		char b = 'B';
		String c = "ABC";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println("Hello"+'q');
		System.out.println("Hello"+3.14);
		System.out.println(10+20+"Hello");
		System.out.println(10+"Hello"+20);
		System.out.println(10+(20+"Hello")); //숫자 못만나게 묶음
	}
}
