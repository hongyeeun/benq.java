package org.yen.day05.dimarray.exercise;

public class Excercise_DimArray7 {
	public static void main(String[] args) {
		int arr[][]=new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i%2==0) {
					arr[i][4-j]=k;
				}
				else { 
					arr[i][j]=k;
				} k++;
				}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
