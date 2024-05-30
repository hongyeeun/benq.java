package org.yen.day09.oop.inheritance;

import org.yen.day09.oop.inheritance.point.Point;

class Super {
	public int pub;		// public
	int def;			// default
	protected int pro;	// protected
	private int pri;	// private
}

class Sub extends Super {
	void set() {
		Super sup = new Super();
		sup.pro = 507;
		super.pub = 24;
		super.def = 5;
		super.pro = 7;
//		super.pri = 1023;  // private이라 접근불가
		
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 24;			// public 이니까
//		p.def = 57;			// default는 같은 패키지에서 가능
//		p.pro = 10; 		// protected는 같은 패키지 또는 상속일 때 가능
							// Point가 다른 패키지에 있으므로 사용불가능하다.
//		p.pri = 23; 		// 당연히 안됨 private
		
		super.pub = 2024;
//		super.def = 135; 	// def 는 안됨
		super.pro = 23;		// 상속해서 가능해짐 -> super 통해서 접근 가능O
//		super.pri = 1034; 	// 당연히 안됨 private
		
	}
}

public class Exam_Protected {
	
}
