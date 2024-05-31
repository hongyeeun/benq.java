package selfstudy.yen.hw01;

import java.util.Scanner;

public class Bank {
	
	User currentUser;
	
	public void inputUser(User user) {
		currentUser = user;
	}
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마를 입금하시겠습니까? ");
		int depositAmount = sc.nextInt();
		int balance = depositAmount;
	}
	public void withdraw() {}
	public void RecentTransAction() {}
	public void MakeAccount() {}
		public void checkAcoount(User user) {
//		현재 내 계좌 정보입니다.
		System.out.println("현재 내 계좌 정보입니다.");
		System.out.println("아이디 : "+user.getId());
		System.out.println("사용자 : "+user.getName());
//		System.out.println("비밀번호 : "+user.getPw());	//비밀번호는 보안상..
		System.out.println("계좌번호 : "+user.getAccount());
		System.out.print("현재 잔액 : "+user.getBalance());
	}
	
		// TODO Auto-generated method stub
		
	}

