package selfstudy.yen.hw01;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	public int printMenu() {
		System.out.println("=====하오은행ATM=====");
		System.out.println("1. 로그인");
		System.out.println("2. 계좌확인");
		System.out.println("3. 입금하기");
		System.out.println("4. 인출하기");
		System.out.println("5. 마지막 거래내역 확인");
		System.out.println("6. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;	
	}
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	public void login() {
		System.out.println("로그인 메뉴입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();
	}
	public void checkAcoount() {
//		현재 내 계좌 정보입니다.
//		사용자 : 장하오
//		현재 잔액 : 50,000원
		System.out.println("현재 내 계좌 정보입니다.");
		System.out.print("사용자 : ");
		System.out.print("현재 잔액 : ");
	}

}
