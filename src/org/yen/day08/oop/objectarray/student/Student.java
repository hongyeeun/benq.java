package org.yen.day08.oop.objectarray.student;

import java.util.Scanner;

public class Student {
	String name;
	int score1;
	int score2;
	Scanner sc = new Scanner(System.in);
	
	public Student() {}
	
	public Student(String name,int score1,int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public String toString() {
		return (this.name +" 학생의 첫번째 점수는 "+this.score1+"점, "
				+ "두번째 점수는 "+this.score2+"점입니다.");
	}
}
