package org.yen.day09.oop.overloading;

class Weapon{
	String name;
	int price;
	
	public Weapon( ) {}
	public Weapon(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// weapon 메소드명 똑같은데 왜 오류가 나지않는걸까? -> Overloading
	// 매개변수의 개수와 타입이 다르면 이름이 같아도 다른 메소드로 간주한다.
	// 이름은 똑같으나 매개변수의 갯수나 타입이 달라야 적용됨
}

public class Exam_Overloading {
	public static void main(String[] args) {
		// 오버로딩이 적용되어 있는 사례
		// ex) System.out.println("")
		System.out.println("고마워 오버로딩");
		System.out.println(1032);
		System.out.println('F');
		// 다른 타입이라 가능
	}
	public void makesomenoise() {
		
	}
//	public void makesomenoise() {
//		
//	} //오류남
	public void makesomenoise(int num) {
		
	}
	public void makesomenoise(String value) {
		
	}
	// 매개변수의 타입을 지정해주어서 오류가 안나게끔 한다.
}
