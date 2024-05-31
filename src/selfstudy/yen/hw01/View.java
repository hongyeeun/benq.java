package selfstudy.yen.hw01;

import java.util.Random;
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
	public User sign() {
		Scanner sc = new Scanner(System.in);
		System.out.println("৻(≧ᗜ≦৻)하오은행의 회원이 되어주세요✿");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		int account = (int)(Math.random() * 8999) + 1000;
		System.out.println("계좌번호 :"+account);
		int balance = 0;
		User user= new User(name, id, pw, balance, account);
		return user;
	}

}
