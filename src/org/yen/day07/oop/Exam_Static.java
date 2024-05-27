package org.yen.day07.oop;

class StaticSample{
	public int num;
	public static int input;
	
	public void sampleMethod() {}

	public void goodMethod() {}

	public static void originMethod() {
		input = 2024;
	}
}
//소괄호가 있으면 메소드 
public class Exam_Static {

	public static void main(String[] args) {
		//바로 불러서 바로 써먹을 수 있다.
		StaticSample.input = 1023;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
//		StaticSample smp = new StaticSample();
//		smp.num = 506;
//		smp.sampleMethod();
//		smp.goodMethod();
	}

}
