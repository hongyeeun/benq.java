package org.yen.day05.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0; //변수
		int nums[] = new int[10]; //배열
		int dimNums[][] = new int[2][5]; //2차원 배열  배열 안에 배열이 들어간 것이다.
		System.out.println("행의 길이 : "+dimNums.length);
		System.out.println("열의 길이 : "+dimNums[0].length); //첫번째의 길이 
		
		int arrs[][]=new int[4][4];   //모든 배열의 값을 지정할 수 있다.
		//2차원 배열 값 입력할 때는 중첩 반복문으로 한다. 행->열
		int k=1;
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				arrs[i][j]=k;
				k++;
			}
		}
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//for-each로 출력
//		(for int arr[] : arrs){
//			for (int j : arr) {
//				System.out.print(j+ " ");
//			}
//		}	
	}
}

// arrs[0][0] = 1;
// arrs[0][1] = 2;
// arrs[0][2] = 3;
// ...
// arrs[1][0] = 5;
// arrs[1][1] = 6;
// ...
// arrs[2][5] = ~;
