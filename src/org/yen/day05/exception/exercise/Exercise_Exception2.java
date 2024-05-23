package org.yen.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {
	public static void main(String[] args) {
		// 문제 2
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는
		// InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		// 정수 3개를 입력하세요.
		// 11 2 3
		// 합은 16
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int sum = 0;
			System.out.println("정수 3개를 입력하세요.");
			for(int i=0;i<3;i++) {
				try {
					sum+=sc.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("문자를 입력하였습니다. 정수를 입력해주세요.");
					sc.next();		//문자입력할때 쓰는 것
					//이거 안써주면 예외문구가 무한반복되므로 (처음에 줬던 문자가 계속 남아있어서)
					//sc.next를 주면 처음에 줬던 문자가 사라지게 되어 새로운 커서란이 뜬다.
					i--;	//이미 실행되어있던 것을 취소 (중요)
					continue;
				} 
			}
			System.out.printf("합은 %d\n", sum);
		}
		
	}
}
