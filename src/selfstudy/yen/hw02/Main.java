package selfstudy.yen.hw02;

import java.util.Scanner;

import selfstudy.yen.hw02.Bank;
import selfstudy.yen.hw02.View;

public class Main {
	
	public static void main(String[] args) {
		View view = new View();
		Bank myAccount = new Bank();
		
		System.out.println("৻(≧ᗜ≦৻)하오은행의 회원이 되어주세요✿ ");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("예금주: ");
		myAccount.name = sc.nextLine();
		
		System.out.print("아이디: ");
		myAccount.id = sc.nextLine();
		
		System.out.print("비밀번호: ");
		myAccount.pw = sc.nextLine();
		
		myAccount.account_num = (int)(Math.random() * 8999) + 1000;
		System.out.print("계좌번호: "+myAccount.account_num);
		System.out.println();
		
		System.out.print("잔고: ");
		myAccount.balance = sc.nextInt();
		
		System.out.println(myAccount.name + "님 계좌가 개설되었습니다.");
		end:
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1:
				int depositAmount = view.inputmoney();
				myAccount.deposit(depositAmount);
				break;
			case 2:
				int withdrawAmount = view.inputmoney();
				myAccount.withdraw(withdrawAmount);
				break;
			case 3:
				myAccount.printAccount();
				break;
			case 4:
				view.printMessage("프로그램을 종료합니다.");
				break end;
			default:
				view.printMessage("1~6사이의 숫자를 입력하세요");
					
			}	
		}
	}
}
		

