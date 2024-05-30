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
				view.login();
				break;
			case 2:
				view.checkAcoount();
				break;
			case 3:
				bank.deposit();
				break;
			case 4:
				bank.withdraw();
				break;
			case 5:
				bank.RecentTransAction();
				break;
			case 6:
				view.printMessage("종료합니다.");
				break end;
			default:
				view.printMessage("1~6사이의 숫자를 입력하세요");
			}	
		}
	}
}
