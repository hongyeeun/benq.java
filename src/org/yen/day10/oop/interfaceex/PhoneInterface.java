package org.yen.day10.oop.interfaceex;

public interface PhoneInterface {
	// 인터페이스는 상수형 필드만 가능
	// 추상메소드로만 구성됨
	public static final int TIME_OUT = 1000;
	// public String name; 	//일반필드 사용불가 
	public abstract void printLogo();	//추상메소드만 가능
//	public void sendCall() {};	//일반메소드 사용불가
	void sendCall();	//public abstract 생략 가능해서 얜 됨
	public default void showLogo() {
		/*
		 * 디폴트 메소드(기능 추가)
		 * 하위 호환성을 위해 작성하며
		 * 인터페이스의 보완이 가능함.
		 */
	}

}
