package org.yen.day08.oop.student;

import java.util.Scanner;
// 화면 출력을 담당하는 메소드
public class ViewStudent {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;	
	}

	public void displayMsg(String message) {
		System.out.println(message);
	}
}
