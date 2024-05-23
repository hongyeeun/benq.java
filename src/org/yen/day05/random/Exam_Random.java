package org.yen.day05.random;

import java.util.Random;

public class Exam_Random {	
	public static void main(String[] args) {
		
		Random rand = new Random();	//랜덤함수 사용하여 임의의 수를 뽑아낼 수 있다.
		for(int i=0; i<10; i++) {
			int num = rand.nextInt(100); //0~99까지 출력
			System.out.print(num+" ");
		}	
		// 1~10 사이의 랜덤한 수를 구하시오.
		// rand.nextInt(10) : 0~9 사이의 랜덤한 수
		int num2 = rand.nextInt(10)+1; // 1~10사이의 랜덤한 수
		System.out.println();
		System.out.println(num2);

		//25부터 35사이의 랜덤한 수를 출력하시오
		//rand.nextInt(11)+25
		
		//1또는 2의 랜덤한 수를 출력하시오
		int num3 = rand.nextInt(2)+1; //0~1 + 1 이렇게 설정해야함
		System.out.println(num3);
		
		 //math는 내장함수여서 따로 input안하고 random()을 이용해서 사용가능
		for(int i=0; i<10; i++) {
//			double randNum = Math.random();
			int randNum = (int)(Math.random()*10); //math는 0~1의 소수점수인데 10을 해주고 int 해주면 0~9의 수로 나온다.
			// 1~10 사이의 값
			// (int)(Math.random()*10)+1
			// 25~35 사이의 값
			int randNum2 = (int)(Math.random()*11)+25;
			// random()*n 이면 0~n-1까지의 값이 나오는 것이다. 즉 범위를 0~10으로 하고싶으면 11을 곱한다.
			System.out.println(randNum);
			System.out.println(randNum2);
		}
	}
}
