package org.yen.day06.array.sort;

public class Exam_AraaySort {

	public static void main(String[] args) {
		// 정렬
		// 크기가 5인 배열이 있고 24 5 7 10 23
		// 7 24 5 23 10 -> 5 7 10 23 24 이렇게 오름차순으로 배열
		// 01. 정렬 알고리즘
		// - 알고리즘이란 문제 해결을 하기 위한 절차나 방법,
		// 프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
		// 02. 정렬 알고리즘 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		// 7 24 5 23 10 -> 5 7 10 23 24
		// 자리바꿈 발생! 
		// 1. 자리바꿈은 어떻게 해결할 것인가?
		// 2. 어떤 조건이 만족하면 바꿀 것인가?
		int num1 = 5;
		int num2 = 7;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		//num1에는 7이 들어가고 num2에는 5가 들어가도록 해야함. (자리 바꾸도록 해야함)
		// 사라지기 전에 5를 저장해야한다.
		int temp = num1; //num1 값을 변경하기 전에 다른 변수에다 저장
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2); 
		
		int nums[] = {2,1,3};
		// 3 2 1 이 되도록 바꿔보세요!
//		int temp1 = nums[0]; int temp2 = nums[1];
//		nums[0]=nums[2];
//		nums[1]=temp1;
//		nums[2]=temp2;
//		
		//강사님 (자리바꾸기 두번)
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;   //(3,1,2)
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		for(int i=0; i<3; i++) 
			System.out.print(nums[i]+" ");
		System.out.println();
		
		int opens[] = {24, 5, 7};
		//5 7 24이 되도록 바꿔보세요.
		temp = opens[0];
		opens[0]=opens[1];
		opens[1] = temp;  //5 24 7
		
		temp = opens[1];
		opens[1] = opens[2];
		opens[2] = temp;	// 5 7 24
		
		for(int i=0;i<3;i++)
			System.out.print(opens[i]+" ");
		// {24, 5, 7} -> {7,5, 24} -> {5, 7, 24} 이렇게 바꾸는 방법도 있다.
		
	}
}
