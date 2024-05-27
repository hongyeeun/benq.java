package org.yen.day05.random.exercise;

import java.util.Scanner;

public class Quiz2 {

//	고객 요구사항에 맞춰 소수를 판단하는 프로그램을 개발하세요
//	고객 요구사항
//	 1. 스캐너를 통해 1~100 사이의 정수를 하나 입력 받는다,
//	       1~100 사이의 정수가 아니면 "1~100 사이의 정수를 입력하세요!" 출력 후 종료.
//	 2. 1은 소수가 아니기 때문에 1 입력 시 "1은 소수가 아닙니다." 출력 후 종료
//	 3 2~100 사이의 수 입력 시 소수인지 아닌지를 확인하여 결과 출력 후 종료
//	---- 2 ~ 100 사이의 정수를 입력한 경우 ----
//	1 ~ 100 사이의 정수를 입력하세요 : 3
//	3은(는) 소수입니다.

//소수는 1과 자기자신만을 약수로 가짐...
	// 나머지가 자기자신.. 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
		 int num = sc.nextInt();
		 if(num>=2&&num<=100) {
			 if(num%2==0||num%3==0||num%5==0||num%7==0) {
				 if(num==2||num==3||num==5||num==7) {
					 System.out.println(num+"은(는) 소수입니다.");
				 }else System.out.println(num+"은(는) 소수가 아닙니다.");
			 } else System.out.println(num+"은(는) 소수입니다.");
		 } else if(num==1) {
			 System.out.println("1은 소수가 아닙니다.");
		 }
		   else {
			System.out.println("1부터 100 사이의 정수를 입력하세요! ");
		 }

	 }
}
