package org.yen.day09.oop.encapsulation;

import java.util.Scanner;

public class Student {
	private String name;
	private int score1;
	private int score2;
	Scanner sc = new Scanner(System.in);
	
	public Student() {}
	
	public Student(String name,int score1,int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public String toString() {
		return this.name+" 학생의 첫번째 점수는 "+this.score1+"점, "
				+ "두번째 점수는 "+this.score2+"점입니다.";
	}
	
	// 캡슐화 -> 무조건 해야함 ...
	// setter()
	public void setName(String name) {
		this.name = name;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	//getter()
	// this 붙여도 되고 안붙여도 됨.. setter은 this 무조건 붙여야함
	public String getName() {
		return name;
	}
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
}
