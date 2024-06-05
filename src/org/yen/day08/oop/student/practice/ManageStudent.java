package org.yen.day08.oop.student.practice;

import java.util.Scanner;

public class ManageStudent {
	// 멤버필드
	int kor;
	int eng;
	int math;
	//객체배열을 사용해서 이러한 멤버변수들을 클래스로 묶어서 사용할 수 있다.
	
	public ManageStudent() {} //생성자
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	public void printScore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3.0);
	}
}
