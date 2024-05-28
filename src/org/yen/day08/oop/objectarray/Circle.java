package org.yen.day08.oop.objectarray;

public class Circle {
	public int radius;
	
	public Circle() {} //생성자(클래스이름과 동일)
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius; 
		return area;
	}
}
