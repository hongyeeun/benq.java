package org.yen.day10.oop.member.practice;

import java.util.Scanner;

public class ViewMember {
	Scanner sc = new Scanner(System.in);
	public ViewMember() {}
	public int printMenu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원전체조회");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	public Member inputMember() {
		System.out.println("아이디 : ");
		String memberId = getMemberId();
		return null;
	}
}
