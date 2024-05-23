package org.yen.day05.exception.exercise;

public class Exercise_Exception3 {
	public static void main(String[] args) {
		// 문제 3
		// 배열의 인덱스가 범위를 벗어날 때
		// 발생하는 ArrayIndexOutOfBoundsException을 
		// 처리하는 프로그램을 작성하시오.
		int arr[] = new int[4];
		try {
//			for(int i=0;i<=4;i++) {
//				arr[i]=i;
//				System.out.println(arr[i]);
//			}
			System.out.println(arr[5]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스의 범위를 벗어났습니다.");
		}
	}
}
