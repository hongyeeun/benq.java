package selfstudy.yen.hw02;

import java.util.Scanner;

class Bank{
	int account_num;
	String name;
	int balance;
	String id;
	String pw;
	
	public Bank() {
		
	}
	public void deposit(int depositAmount) {
		if(depositAmount < 1000) {
			System.out.println("입금액은 1000원 이상만 가능합니다.");
		}else {
			balance += depositAmount;
			System.out.println("입금이 완료되었습니다.");
			System.out.println(name+"의 현재 잔고는 "+balance+"원 입니다.");
		}	
	}
	
	public void withdraw(int withdrawAmount) {
		if(withdrawAmount < 1000) {
			System.out.println("출금액은 1000원 이상만 가능합니다.");
		}else if(balance < withdrawAmount){
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -= withdrawAmount;
			System.out.println("출금이 완료되었습니다.");
			System.out.println(name+"의 현재 잔고는 "+balance+"원 입니다.");
		}
	}
	
	public void printAccount() {
		System.out.println("현재 내 계좌 정보입니다.");
		System.out.println("아이디 : "+id+" 비밀번호 : "+pw);
		System.out.println("고객님: " + name);
		System.out.println("계좌번호: " + account_num);
		System.out.printf("잔고: %,d원%n", balance);
	}

}

