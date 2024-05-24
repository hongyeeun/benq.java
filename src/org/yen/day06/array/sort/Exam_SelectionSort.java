package org.yen.day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		// 특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
		// 데이터의 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n+1 ~ 마지막 인덱스까지 비교함.\
		// 비교 횟수는 항상 인덱스의 개수보다 1개 적다.
		// {2, 5, 4, 1, 3}
		// 첫번째 결과 : { 1, 5, 4, 2, 3} 최솟값을 골라서 첫번째 값과 바꿔줌
		// 두번째 결과 : { 1, 2, 4, 5, 3} 1을 제외한 나머지 중에서 최솟값을 골라서 두번째 값과 바꿔줌
		// 세번째 결과 : { 1, 2, 3, 5 ,4} 1과 2를 제외한~
		// 네번째 결과 : { 1, 2, 3, 4, 5} 4와 5중에 비교하여 최솟값 더 왼쪽에.
		int arrs[] = {2, 5, 4, 1, 3};
		for (int i=0; i<5; i++) {
			int min = i; //최솟값을 i로 설정 (i가 증가할때마다 매번 바뀜) 
			for(int j=i+1;j<5;j++) {
				if(arrs[min]>arrs[j]) {
					min = j; //최소값이 정해졌을 때 arrs[min]은 최솟값이며
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}	
		for(int num : arrs) {
			System.out.print(num+" ");
		}
//			if(arrs[0] > arrs[1]) {
	//			// 니가 최소값이야
	//		}
	//		if(arrs[0] > arrs[2]) {
	//			// 니가 최소값이야
	//		}
	//		if(arrs[0] > arrs[3]) {
	//			// 니가 최소값이야
	//		}
	//		if(arrs[0] > arrs[4]) {
	//			// 니가 최소값이야
	//		}
	//		int temp = arrs[0];
	//		arrs[0] = 최소값;
	//		최소값의 자리 = temp;
	//		
	//		if(arrs[1] > arrs[2]) {
	//			// 니가 최소값이야
	//		}
	//		if(arrs[1] > arrs[3]) {
	//			// 니가 최소값이야
	//		}
	//		if(arrs[1] > arrs[4]) {
	//			// 니가 최소값이야
	//		}
	//		int temp = arrs[1];
	//		arrs[1] = 최소값;
	//		최소값의 자리 = temp;
	//		
	//		if(arrs[2] > arrs[3]) {
	//			// 니가 최소값이야
	//		}
	//		if(arrs[2] > arrs[4]) {
	//			// 니가 최소값이야
	//		}
	//		int temp = arrs[2];
	//		arrs[2] = 최소값;
	//		최소값의 자리 = temp;
	//		
	//		if(arrs[3] > arrs[4]) {
	//			// 니가 최소값이야
	//		}
	//		int temp = arrs[3];
	//		arrs[3] = 최소값;
	//		최소값의 자리 = temp;
				
			
		}
		
	}

