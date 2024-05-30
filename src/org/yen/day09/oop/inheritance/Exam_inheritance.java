package org.yen.day09.oop.inheritance;

import org.yen.day09.oop.inheritance.point.ColorPoint;

public class Exam_inheritance {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(10, 23, "green");
		cp.showColorPoint();
		
		// 밑의 코드는 부모의 것만 쓸 때 사용
//		ColorPoint cp = new ColorPoint();
//		cp.setX(5);
//		cp.setY(7);
//		cp.showPoint();		
		// ColorPoint에 아무것도 적은게 없는데 Point로부터 상속받아서 
		// Point 의 메소드를 쓸 수 있다.
	}
}
