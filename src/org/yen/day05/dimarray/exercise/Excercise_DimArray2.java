package org.yen.day05.dimarray.exercise;

public class Excercise_DimArray2 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int k=1;
		for (int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[j][i]=k;
				k++;
			}
		}
		for (int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
