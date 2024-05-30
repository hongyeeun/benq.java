package org.yen.day09.oop.encapsulation;

import java.util.Scanner;

public class Member {	
	// 캡슐화
	// 필드에 private
	private String name;
	private char gender;
	private int age;
	private String education;
	private long salary;
	private String job;
	private long property;	//집1채, 자동차2대 -> String, 몇억~-> long
	private String phone;	//01012341234 : 앞에 0이 들어가려면 숫자가 아닌 string을 써야함
	private String address;		
	private boolean divorceYN; //Yes or No (이혼여부)
	private String children;	//1남 1여, 아들1, 딸1
	
	//생성자
	public Member() {}
	
	// 메소드 는 public
	public void registerMember() {}
	public void doHear() {}
	public void sendMessage() {}
	public void doPromise() {}
}
