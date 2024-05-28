package org.yen.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
//		======메인메뉴======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 
		Scanner sc = new Scanner(System.in);
		int kor = 0; //while문 바깥에 넣어야 계속 초기화되는것을 막는다.
		int eng = 0;
		int math = 0;
		end : //while문 바깥에 end 포인트 넣어서 종료누르면 while문 끝나게 한다.
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			// 무조건 1번부터 하는 것이 아니므로 이렇게 switch 문 밖에서 0으로 초기화시켜줘야한다.
			// 만약 2번부터 했을 경우 0으로 나온다.
			switch(choice) {
			case 1 :
//				====== 성적 입력 ======
//				국어 : 88
//				영어 : 77
//				수학 : 66
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break; //break안쓰면 자동으로 case2넘어가므로 써줘야한다.
			case 2 :
//				====== 성적 출력 ======
//				국어 : 88
//				영어 : 77
//				수학 : 66
//				총점 : 231
//				평균 : 77.0
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : "+kor); 
				System.out.println("영어 : "+eng);
				System.out.println("수학 : "+math);
				System.out.println("총점 : "+(kor+eng+math));
				System.out.println("평균 : "+(kor+eng+math)/3.0);
				break;
			case 3 :
//				프로그램이 종료되었습니다.
				System.out.println("프로그램이 종료되었습니다.");
				break end; 	//end라는 포인트를 만들어서 종료하게끔
			default :
//				1 ~ 3 사이의 숫자를 입력해주세요.
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
			}
		}
	}
}
