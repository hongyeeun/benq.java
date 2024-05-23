package org.yen.day05.dimarray.exercise;

public class Excercise_DimArray1 {
	public static void main(String[] args) {
		int arrs[][] = new int[5][5];
		int k=1;
		for(int i=0;i<arrs.length;i++) {
			for(int j=0; j<arrs[i].length;j++) {
				arrs[i][4-j]=k;
				k++;
			}
			//for(int j=4; j>=0; j--) {
			// arrs[i][j]= ~ 해도 됨 }
		}
			for(int i=0;i<arrs.length;i++) {
				for(int j=0; j<arrs[i].length;j++) {
			System.out.print(arrs[i][j]+"\t"); //\t는 띄어쓰기 일정하게
				}
			System.out.println();
			}
			
			//for-each
//			for(int arr[]:arrs){
//				for(int num : arr) {
//				System.out.println(num + "\t");
//				} System.out.println();
//			}
	}
}
