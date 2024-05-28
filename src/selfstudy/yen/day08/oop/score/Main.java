package selfstudy.yen.day08.oop.score;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		end:
		while(true) {
			int choice = bank.printMenu();
			switch(choice) {
			case 1:
				bank.login();
				break;
			case 2:
				bank.checkAcoount();
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
				break end;
			}	
		}
	}
}
