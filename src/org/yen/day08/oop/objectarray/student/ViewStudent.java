package org.yen.day08.oop.objectarray.student;

import java.util.Scanner;

public class ViewStudent {
	
	public Student[] displayInput() {
		Scanner sc = new Scanner(System.in);
		Student students[] = new Student[3];
		for (int i=0; i<students.length;i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("첫번째 점수 : ");
			int score1 = sc.nextInt();
			System.out.print("두번째 점수 : ");
			int score2 = sc.nextInt();
			students[i] = new Student(name, score1, score2); 
			// 이 표현을 외우자 (입력한 값이 나오려면 입력할때 같이..)
			// 매개변수 name, score1, score2를 가진 Student의 객체로 이루어진 
			// students 생성 (총 i번 반복)
		}
		return students;
	}
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	public static void displayMSG(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public void displayInfo(Student students[]) {
		for (int i = 0; i<students.length;i++) {
			System.out.println(students[i].toString());	//students[1].toString부터 출력
		}
	}
}
