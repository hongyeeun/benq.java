package selfstudy.yen.hw01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		View view = new View();
		
		end:
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1:
				// 회원가입
				User user = view.sign();
				bank.inputUser(user);
				break;
			case 2:
				// 계좌확인
				bank.checkAcoount(user);
				break;
			case 3:
				// 입금하기
				bank.deposit();
				break;
			case 4:
				// 인출하기
				bank.withdraw();
				break;
			case 5:
				// 마지막 거래내역
				bank.RecentTransAction();
				break;
				// 종료하기
			case 6:
				view.printMessage("종료합니다.");
				break end;
			default:
				view.printMessage("1~6사이의 숫자를 입력하세요");
			}	
		}
	}
}
