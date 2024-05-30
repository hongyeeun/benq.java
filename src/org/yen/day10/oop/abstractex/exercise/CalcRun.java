package org.yen.day10.oop.abstractex.exercise;

public class CalcRun {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Calculator calc = new GoodCalc();	//업캐스팅 (부모 = 자식객체) -> 이렇게 많이 쓴다
		System.out.println("합 : "+ calc.add(5, 7));	// 5 7
		System.out.println("차 : " + calc.substract(10,23));	// 10 23
		System.out.println("평균 : " + calc.average(new int[] {5,7, 10, 23}));	// int에 변수 넣을때 이렇게..
		int nums[] = {5, 7, 10, 23};
		System.out.println("평균 : "
				+calc.average(nums));
	}
}
