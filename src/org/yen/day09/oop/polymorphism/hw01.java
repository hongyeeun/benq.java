package org.yen.day09.oop.polymorphism;

// 정처기 기출 이라했으니 설명 들어보기 .. 
public class hw01 {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}

class SuperClass{
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super ObJECT");
	}
}

class SubClass extends SuperClass{
	void paint() {
		super.paint();	
		super.draw();	
	}
	void draw() {
		System.out.println("sub object");
	}
}