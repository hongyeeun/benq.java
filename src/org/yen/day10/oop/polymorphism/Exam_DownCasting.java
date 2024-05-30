package org.yen.day10.oop.polymorphism;

class Person{
	String name;
	String id;
	
	public Person() {}
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student() {
	}
	public Student(String grade, String department) {
		this.grade = grade;
		this.department = department;
	}
}

public class Exam_DownCasting {
	public static void main(String[] args) {
		Person p = new Student();	// 업캐스팅
									// 상속관계인 경우에 가능
		System.out.println(p.name);		// 부모클래스의 필드엔 접근 가능
		System.out.println(p.id);
//		System.out.println(p.grade);	// 자식클래스의 필드엔 접근 불가능
//		System.out.println(p.department);		// 다운캐스팅을 해줘야한다
		
		//다운캐스팅 
		System.out.println(((Student)p).grade);	// ((자식클래스)객체명).자식클래스필드
		System.out.println(((Student)p).department);
			
	}
}
