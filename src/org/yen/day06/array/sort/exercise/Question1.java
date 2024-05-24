package org.yen.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i=0; i<5; i++){
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i]=sc.nextInt();
		}
		//버블정렬 알고리즘 (인접한 것들끼리 정렬)
		//length 보다는 1개 적게 배열이 돌아가므로 length-1로 써줌 
		for(int i=0;i<(arr.length-1);i++) {
			for(int j=0;j<(arr.length-1)-i;j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("정렬된 결과 : ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("정렬 후 첫번째 수와 마지막 수의 합 : "+(arr[0]+arr[4]));
		//문자열+변수-> 묶어줘야한다.
	}
}
