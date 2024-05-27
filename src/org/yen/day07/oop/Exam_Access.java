package org.yen.day07.oop;

// 접근지정자(제한자)
// 종류 : public, protected, default, private
class Sample{
	public int a;
	private int b;
	int c;
}
public class Exam_Access {
	public static void main(String[] args) {
		Sample smp = new Sample();
		smp.a = 507;
//		smp.b = 1023; 	// The field Sample.b is not visible -> private 이므로
		smp.c = 2024;	// default는 가능
	}
}
