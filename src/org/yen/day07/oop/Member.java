package org.yen.day07.oop;

import java.util.Scanner;

public class Member {	
	//멤버변수(필드) : 자료형과 같이 쓰임
	public String name;	//public 과 쓰이면 : 다른 클래스에서도 이 변수를 사용가능하다.
	char gender;
	public int age;
	String education;
	long salary;
	public String job;
	long property;	//집1채, 자동차2대 -> String, 몇억~-> long
	String phone;	//01012341234 : 앞에 0이 들어가려면 숫자가 아닌 string을 써야함
	String address;		
	boolean divorceYN; //Yes or No (이혼여부)
	String children;	//1남 1여, 아들1, 딸1
	
	//생성자
//	public Member() {}
	
	//멤버메소드(메소드) : 동작
	public void registerMember() {}
	public void doHear() {}
	public void sendMessage() {}
	public void doPromise() {}
}
