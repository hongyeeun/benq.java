package org.yen.day09.oop.overriding;

public class Exam_OVerriding {
	// 오버라이딩은 슈퍼 클래스의 메소드를 서브 클래스에서 재정의한다는 뜻이다.
	// 덮어쓰기라고도 불림.
	
	static void paint(Shape shape) {
		// Shape shape = new Shape();
		// Shape shape = new Circle();
		// Shape shape = new Line();
		// Shape shape = new Rectangle();
		// shape은 다 받을 수 있다. (부모 속성이므로)
		shape.draw();
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		paint(shape);
		Circle circle = new Circle();
		paint(circle);		
		// paint에는 매개변수가 shape 변수가 들어가야하는데 , 
		// circle이 자식속성이므로 paint에 들어갈 수 있다. (위의 주식들과 비슷.)
		Line line = new Line();
		paint(line);
		Rectangle rect = new Rectangle();
		paint(rect);
		// 밑의 주석처리한 것과 똑같이 나옴
		// 오버라이딩 하여서 paint(circle) 에 circle 이 나옴.. 
		// 만약 오버라이딩 안했으면 부모의 paint를 따라감
		// 동적 바인딩 -> 오버라이딩 먼저 
		
		/*
		 *  오버라이딩
		 *  1. 오버라이딩은 상속관계에서 사용
		 *  2. 오버라이딩은 다 똑같고 (접근지정자, 반환형, 메소드명, 매개변수 갯수와 타입)
		 *  실행문자만 재정의하는 것
		 *  3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음.
		 */
	//	Shape shape = new Shape();
	//	shape.draw();							//Shape 나옴
	//	Circle circle = new Circle();
	//	circle.draw();							//Circle 나옴 (오버라이딩 했으므로)
	//	Line line = new Line();
	//	line.draw();							//Line 나옴 (오버라이딩 했으므로)
	//	Rectangle rect = new Rectangle();
	//	rect.draw();							//Rectangle 나옴 (오버라이딩 했으므로)
	}
}
