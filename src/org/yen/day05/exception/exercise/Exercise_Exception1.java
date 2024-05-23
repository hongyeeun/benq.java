package org.yen.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		// 문제 1
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!" 를 출력하고
		// 다시 입력 받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수 : ");
			int num2 = sc.nextInt();
			int result = 0; 
			try {
				result= num1/num2;
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
				continue;
			} 
			System.out.printf("%d을 %d으로 나눈 몫은 %d입니다.", num1, num2, result);	
			System.out.println();
		}
	}
}
