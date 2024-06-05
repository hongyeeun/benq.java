package selfstudy.yen.hw02;

import java.util.Random;
import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	
	public int printMenu() {
		System.out.println("=====하오은행ATM=====");
		System.out.println("1. 입금하기");
		System.out.println("2. 인출하기");
		System.out.println("3. 잔고확인");
		System.out.println("4. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;	
	}
	public void printMessage(String msg) {
		System.out.println(msg);
	}

	public int inputmoney() {
		System.out.print("돈을 입력해주세요 : ");
		int money = sc.nextInt();
		return money;
	}

}
