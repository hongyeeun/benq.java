package org.yen.day08.oop.student.practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("2~9 사이의 정수 입력 : ");
			int input = sc.nextInt(); // 1. int 타입이지만 String 입력 문제점 부분, 원인은 next()
									 // 해결방안은 nextInt()
			if(input>=2&&input<=9) { // 2. 조건을 만족하기 위해서는 input >=2이 있어야하고 &&로 연결해야함
				
				for (int num =1; num<=9; num++) {
					System.out.printf("%d * %d = %d", input, num, input*num);	
					// 3. printf를 쓰고 있으며 형식문자 3개니까 전달값도 3개이어야하므로 input*num을 추가해준다.		
				} break; //4. 문제의 요구사항 후에는 구구단 출력 후 프로그램이 종료되어야 하므로 break; 문 수정함 ㅇㅅㅇ
			} else {
				System.out.println("2이상 9이하의 정수만 입력해주세요");
			}
		}
	}

}
