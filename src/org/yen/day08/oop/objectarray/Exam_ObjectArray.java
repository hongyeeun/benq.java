package org.yen.day08.oop.objectarray;

public class Exam_ObjectArray {

	public static void main(String[] args) {
		Circle donut = new Circle(10); //반지름 10인 donut이라는 객체 생성
		System.out.println("원의 넓이 : "+donut.getArea());
		Circle pizza = new Circle(7);
		System.out.println("원의 넓이 : "+pizza.getArea());
		
		//Circle로 이루어진 배열 cArrs에 donut, pizza를 넣어줌
		Circle cArrs[] = new Circle[5]; 
		cArrs[0] = donut;
		cArrs[1] = pizza;
		
		// Nullpointer Exception 이 나지 않게 하려면
		cArrs[2] = new Circle(6); //반지름이 6인 객체 생성 후에 배열에 넣어줌
		cArrs[3] = new Circle(8);
		cArrs[4] = new Circle(9);

		System.out.println("====== 배열 초기화 후 출력 ======");
		System.out.println(cArrs[0].getArea()); //donut.getArea() 와 같다
		System.out.println(cArrs[1].getArea());
		System.out.println(cArrs[2].getArea());
		System.out.println(cArrs[3].getArea());
		System.out.println(cArrs[4].getArea());
	}

}
