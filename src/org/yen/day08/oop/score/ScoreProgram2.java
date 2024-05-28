package org.yen.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	// 객체지향적방식 -> 메소드 여러개 만든 방식
	static int kor;		
	static int eng;
	static int math;		//ScoreProgram2 클래스의 멤버필드
	public static void main(String[] args) {
		finish : 
		while(true) {
			int choice = printMenu(); //return된값을 choice안에
			switch(choice) {
			case 1 :
				inputScore();
				break;
			case 2 : 
				printScore();
				break;
			case 3 :
				displayMsg("프로그램을 종료합니다.");
				break finish;
			default :
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	private static void displayMsg(String message) {
	//  message = "프로그램을 종료합니다." 이런것과 마찬가지임
	// 매개변수 설정하여 그 매개변수에 값을 넣는다?..
		System.out.println(message);
	}
	private static void printScore() {
		// 성적 출력 메소드
		System.out.println("====== 성적 출력 ======");
		// main + 모든 메소드에서 kor~ 을 사용하므로 main 바깥에서도 선언
		//static은 non-static의 것을 쓸 수 없다. -> 변수에 static 설정해줌 (멤버필드)
		System.out.println("국어 : "+kor); 	
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3.0);
	}
	public static void inputScore() {
		//성적입력메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;		//return을 해서 호출한다. 
		// -> void 대신 변수의 타입을 해줌
	}
}

