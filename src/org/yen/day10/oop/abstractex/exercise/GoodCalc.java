package org.yen.day10.oop.abstractex.exercise;

public class GoodCalc extends Calculator {
	//상속받은 메소드가 오버라이딩 해야지 컴파일 오류가 안난다
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		if(b>=a) { 
			return b-a;
		} else {
			return a-b;
		}
	}

	@Override
	public double average(int[] a) {
		// 배열에서 값을 꺼내서 누적합 후 배열의 크기로
		// 나눠버림
		int sum = 0;
		for (int num : a) {
			sum+=num;
		}
		double avg = (double)sum/a.length;
		return avg;
	}
	
}
