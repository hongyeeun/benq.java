package org.yen.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Excercise_Random2 {
	public static void main(String[] args) {
		// 가위바위보 게임
		// 숫자를 선택하세요(1.가위/2.바위/3.보) :1
		// 결과
		// 당신은 가위를 냈습니다.
		// 컴퓨터는 보를 냈습니다.
		// 당신이 이겼습니다.
		
		System.out.println("====가위 바위 보 게임====");
		System.out.println("숫자를 선택하세요(1.가위/ 2.바위/ 3.보) :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Random rand = new Random();
		int computer = rand.nextInt(3)+1;
		String output;
		switch(choice) {
			case 1 : output="가위";
			case 2 : output = "바위";
			case 3 : output = "보";
		}
		switch(computer) {
			case 1 : output="가위";
			case 2 : output = "바위";
			case 3 : output = "보";
		}
		System.out.println("========결과========");
		
	}
}
