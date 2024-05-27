package org.yen.day07.oop.run;

import java.util.Scanner;

import org.yen.day07.oop.Book;
import org.yen.day07.oop.Circle;
import org.yen.day07.oop.Member; 
import org.yen.day07.oop.exercise.Rectangle;

//실행용클래스
public class Run {
	public static void main(String[] args) {
		Run ex = new Run();
		Run.oopPractice1();  //static이면 run.oop~ 로 바로 쓸 수 있다.
		//ex.oopPractice1();  //static붙여져있으면 객체 생성없이 바로 사용가능하다.
//		Math.random(); 
		oopExercise();
	}

		public void constructorEx() {
			//생성자 예제 연습
//			Book book = new Book(); //기본 생성자 이용해서 객체 생성
//									// title, author는 모두 비어잇음
//			book.title = "춘향뎐";
//			book.author = "작자미상";   //기본 생성자일때 이렇게 main에서 해줌
			
			Book book = new Book("춘향뎐","작자미상"); 
			//public 그 중 안해도 되고 이렇게 한 줄로도 가능
			//public 방식은 보안 상 좋지 않음.. 메소드를 통한 우회방식이 좋다
			Book emptyBook = new Book();
			Circle bintz = new Circle();
//			bintz.radius = 10;
			bintz.setRadius(10);	
		}
		public static void oopPractice1() {
			//예제1
			// Circle의 instance를 이용하여
			//이름이 달덩이, 반지름은 5인
			// Circle의 넓이를 출력해보세요~
			Circle circle1 = new Circle();
			circle1.radius=5.0;
			circle1.name="달덩이";
			double area = circle1.getArea();	//변수를 통해 출력
			System.out.println(area);
			
			Circle donut = new Circle();
			donut.radius=2;
			donut.name="던킨도넛";
			area = donut.getArea(); 
			//앞에 circle 클래스에서 double로 해줬으므로 여기서도 생략가능?
			System.out.println(area); 
		}
		
		public static void oopExercise() {

			//문제1
			//너비와 높이를 입력받아
			//사각형의 넓이를 출력하는 클래스를 만드시오
			// >>4 5
			// 사각형의 넓이는 20입니다.
			Scanner sc = new Scanner(System.in);
			Rectangle rect = new Rectangle();
			// int width = sc.nextInt();
			rect.width = sc.nextInt();
			// int height = sc.nextInt();
			rect.height = sc.nextInt();
			// int result = width*height;
			int result = rect.getArea();
			System.out.println("사각형의 넓이는 "+result+"입니다.");
		}
		
		public static void memberPractice() {
			Scanner scanner = new Scanner(System.in);
			Member member1 = new Member(); //객체생성 : 클래스+변수이름 = new 생성자;
			member1.name = "일용자";
			member1.age=33;
			member1.job = "의사";
			Member member2 = new Member();
			member2.name = "이용자";
			member2.age=22;
			System.out.println(member1.name);
			System.out.println(member1.job); 	
			System.out.println(member1.age); 
			System.out.println(member2.name);
			System.out.println(member2.job); 	//적지않은건 비워져있다. : null
			
			// name, age, job은 처음엔 오류가 났지만 앞의 Member 클래스에서 
			// public 으로 해줘서 여기서도 쓰일 수 있게 됨
		}

}
