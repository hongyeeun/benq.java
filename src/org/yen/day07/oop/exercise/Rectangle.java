package org.yen.day07.oop.exercise;

public class Rectangle {
	// 너비와 높이를 입력받아
	// 사각형의 넓이를 출력하는 클래스를 만드시오.
	
	public int width;
	public int height;
	
	public int getArea() {
		return width*height;
		//return을 쓰면 public옆에 결괏값의 자료형을 적어줘야함
	}
}
