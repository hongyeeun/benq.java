package org.yen.day09.oop.polymorphism;

class Person {
	String name;
	String id;
	
	public Person() {}
	public Person(String name, String id) {
		this.name= name;
		this.id = id;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	public Student() {}
}

class Worker extends Person{}
class Doctor extends Person{}

public class Exam_Upcasting {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
//		Person p = new Studnet();
//		부모 = 자식 객체 가능 (반대는 안됨)
		p = s;
		p = new Worker();
		p = new Doctor();
	}
}
