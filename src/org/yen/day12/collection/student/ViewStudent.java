package org.yen.day12.collection.student;

import java.util.List;
import java.util.Scanner;

public class ViewStudent {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public Student[] displayInput() {
		return null;
	}

	public void displayMsg(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	// 학생 정보 입력
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1번째 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2번째 점수 : ");
		int secondScore = sc.nextInt();
		Student std = new Student(name, firstScore, secondScore);
		return std;
	}

	public void displayStudents(List<Student> stdList) {
		System.out.println("========= 학생 전체 정보 출력 =========");
		for(Student std : stdList) {
			System.out.printf("\t이름 : %s\n", std.getName());
			System.out.printf("\t1차 점수 : %d\n", std.getFirstScore());
			System.out.printf("\t2차 점수 : %d\n", std.getSecondScore());
			System.out.println("======================================");
		}
		
	}

	public int inputIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째 회원인지 골라주세요 : ");
		int index = sc.nextInt();
		return index-1;
	}

	public String inputName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category+ "이름을 입력해주세요 : ");
		String name = sc.next();
		return name;
	}

	public void displaySearch(List<Student> searchstd) {
	    System.out.println("해당 학생의 정보는 다음과 같습니다.");
	    for (Student student : searchstd) {
	        System.out.printf("\t이름 : %s\n", student.getName());
	        System.out.printf("\t1차 점수 : %d\n", student.getFirstScore());
	        System.out.printf("\t2차 점수 : %d\n", student.getSecondScore());
	    }
	}
}
