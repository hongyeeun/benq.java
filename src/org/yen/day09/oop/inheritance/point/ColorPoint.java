package org.yen.day09.oop.inheritance.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super();	// this() 처럼 생성자 호출하는데 부모의 생성자를 호출함.
					// 상속받은 경우 부모의 생성자부터 호출함.
	}
	
	// 부모가 가진 것 + 내가 쓸 것 같이 하려면 ... 
	
	public ColorPoint(int x, int y, String color) {
//		this.x = x;		//x, y는 private 으로 되어있으므로 이렇게 안됨
//		this.y = y;
		super(x,y);		// Point의 생성자 Point(x,y)호출
		this.color = color;
	}
	public void showColorPoint() {
		super.showPoint(); 	// 부모의 메소드 상속
		System.out.println(this.color+"색의 점입니다.");
		// 두개 다 같이 나옴
	}
}
