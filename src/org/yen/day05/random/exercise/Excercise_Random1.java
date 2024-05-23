package org.yen.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Excercise_Random1 {
	public static void main(String[] args) {
		// 동전 앞뒤 맞추기!
		// ====동전 앞 뒤 맞추기====
		// 숫자를 입력해주세요(1. 앞면/ 2. 뒷면) : 1
		// 맞췄습니다.
		System.out.println("동전 앞뒤 맞추기!");
		System.out.println("====동전 앞 뒤 맞추기====");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			System.out.print("숫자를 입력해주세요(1. 앞면/ 2. 뒷면) : ");
			int choice = sc.nextInt();
			if (choice==-1) break;
			//int number = rand.nextInt(2)+1; //1~2사이의 랜덤한 수 random함수버전
			int number = (int) ((Math.random()*2)+1);
			if(choice!=1&&choice!=2) {
				System.out.println("숫자를 다시 입력하세요.");
			}
			else {
				if(choice==number) {
					System.out.println("맞췄습니다.");
				}
				else
					System.out.println("틀렸습니다.");
			}
		}
	}
}
