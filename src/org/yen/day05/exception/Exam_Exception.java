package org.yen.day05.exception;

import java.util.InputMismatchException; //input은 util 에 있는 패키지이기때문에 import 해줘야한다.
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!" 를 출력하고
		// 다시 입력 받는 프로그램을 작성하여라.
		
		Scanner sc = new Scanner(System.in);
		//무한반복 : while(true), for(;;)
		while(true) {
			int result = 0;
			int num1 =0, num2 = 0; //try에서 쓰일거면 밖으로 꺼내서 전역변수로 바꿔줌
			try{
				System.out.print("첫 번째 정수 입력 : ");
				num1 = sc.nextInt();
				System.out.print("두 번째 정수 입력 : ");
				num2 = sc.nextInt();
				result = num1/num2;
			} catch(ArithmeticException e) {
				//e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다");
				continue; // 예외되면 몫 문구 안나오게 앞에서부터 반복한다.
			} catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨습니다.");
				sc.next();
				continue; // 예외되면 몫 문구 안나오게 앞에서부터 
			}
			System.out.printf("%d을 %d로 나누면 몫은 %d입니다. \n", num1, num2, result);
		}
	}
}

