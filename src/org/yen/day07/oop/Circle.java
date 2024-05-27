package org.yen.day07.oop;

public class Circle {
	//멤버변수
	// 반지름
	// 이름
	public double radius;
	public String name;
	
	//메서드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 넓이 구하기
	public double getArea() {
		//return을 쓰면 public 옆에
		//리턴값과 같은 데이터타입을 써야함 (void 대신)
		return 3.14*this.radius*this.radius;
		//내가 갖고 있는 radius를 쓰겠다... -> this
	}
}
