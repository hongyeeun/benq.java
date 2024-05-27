package org.yen.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
//	고객 요구사항에 맞춰 가위 바위 보 게임 프로그램을 개발하는 도중 테스트단계에서 고객이 원하는 실행결과가 도출되지 않았다. 예상 실행결과가 정확히 도출될 수 있도록 문제점이 있는 코드를 찾아 원인을 파악하고, 해결 방안을 구상하여 보고서로 제출하시오. (30점)
//
//	고객 요구사항
//	 1. 가위 바위 보 중 하나의 문자열을 입력 받고, 난수를 발생시켜 랜덤하게 가위 바위 보 문자열을 생성한다.
//	 2. 랜덤한 가위 바위 보 문자열과 입력한 문자열이 같으면 아래 실행 결과처럼 비겼다고 출력하고 가위 바위 보 게임을 반복한다.
//	 3 입력한 가위 바위 보 문자열이 랜덤한 가위 바위 보 문자열과 비교하여 가위 바위 보 게임의 룰 대로 이긴 경우 이겼다고 출력, 진 경우 졌다고 출력 후 종료

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다!");
		while(true) {
		System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
		String input = sc.next();
		Random rand = new Random();
		int num = rand.nextInt(3)+1;
		String computer = null;
		switch(num) {
		case 1: computer="가위"; break;
		case 2: computer="바위"; break;
		case 3: computer="보"; break;
		}
		System.out.println("당신은 "+input+"를 냈습니다.");
		System.out.println("컴퓨터는 "+computer+"를 냈습니다.");
		//사용자가 가위일 경우 
		if(input.equals("가위")) {
			if(computer.equals("가위")){
				System.out.println("비겼습니다. 다시 시작합니다.");
				continue;
			} else if(computer.equals("바위")) {
				System.out.println("당신이 졌습니다!");		
				break;
			} else {
				System.out.println("당신이 이겼습니다!");
				break;
			}
		}
		//사용자가 바위일 경우
		if(input.equals("바위")) {
			if(computer.equals("가위")){
				System.out.println("당신이 이겼습니다!");
				break;
			} else if(computer.equals("바위")) {
				System.out.println("비겼습니다. 다시 시작합니다.");
				continue;
			} else {
				System.out.println("당신이 졌습니다!");		
				break;
			}
		}
		//사용자가 보인 경우
		if(input.equals("보")) {
			if(computer.equals("가위")){
				System.out.println("당신이 졌습니다!");		
				break;
			} else if(computer.equals("바위")) {
				System.out.println("당신이 이겼습니다!");
				break;
			} else {
				System.out.println("비겼습니다. 다시 시작합니다.");
				continue;
			}
		}
		
//		if((input.equals("가위")&&computer.equals("보"))||
//				(input.equals("바위")&&computer.equals("가위"))||(input.equals("보")&&computer.equals("바위"))) 
//		{
//				System.out.println("당신이 이겼습니다!");
//				break;
//				
//		} else if((input.equals("가위")&&computer.equals("바위"))||
//					(input.equals("바위")&&computer.equals("보"))|| (input.equals("보")&&computer.equals("가위"))) 
//		{
//					System.out.println("당신이 졌습니다!");		
//					break;
//		} 
//		else if(input.equals(computer)){
//			System.out.println("비겼습니다. 다시 시작합니다.");
//			continue;
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//			continue;
//			}
		}
	}
}
