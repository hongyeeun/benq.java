package org.yen.day05.dimarray.exercise;

public class Exercise_DimArray {
	public void practice1() {
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
			
	}

	public void practice2() {
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

	public void practice3() {
		int arr[][] = new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[4-j][i]=k;
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
	}

	public void practice4() {
		int arr[][]=new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i%2==0) { //0행,2행,4행만 진행
					arr[i][j]=k;
				}
				else { 
					arr[i][4-j]=k;
				} k++;
				}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}	
	}

	public void practice5() {
		int arr[][]=new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i%2==0) {
					arr[j][i]=k;
				}
				else { 
					arr[4-j][i]=k;
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

	public void practice6() {
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

	public void practice7() {
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
