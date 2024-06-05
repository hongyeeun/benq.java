package org.yen.day12.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;	// set인 언터페이스로, import 해줘야함

import org.yen.day12.collection.student.Student;

public class Exam_SetCollection {
	public static void main(String[] args) {
		// Collection의 List, Set, Map -> 저장소
		// 자료구조의 특성에 따라서 선택하여 사용함.
		// Set 순서는 중요하지 않음. 중복을 허용하지 않음
		// -> 중복을 제거할 수 있음.
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("이세훈", 90, 80));// student로 타입을 받았으니, add에 넣을 것도 student객체여야함
		stdSet.add(new Student("허태성", 88, 55));
		stdSet.add(new Student("남궁성", 78, 67));
		stdSet.add(new Student("이세훈", 90, 80));
		
		System.out.println("크기 : "+stdSet.size());	//set은 중복이 불가능하니 3이 나와야하는데 왜 크기가 4가 나오지?
		// 객체 생성은 다 다른 주소로 하므로, 주소값이 같아도 다르게 인식한다.
		
		//Iterator는 set의 인터페이스 ... ?
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	public void setSample() {
		Set<String> strSet = new HashSet<String>();
		strSet.add("체리");
		strSet.add("딸기");
		strSet.add("사과");
		strSet.add("수박");
		strSet.add("포도");
		strSet.add("딸기");		// 중복은 count 되지 않는다.
		
		System.out.println("크기 : "+ strSet.size());
		// 내가 아는 것 중에 중복을 허용하지 않는 것 -> 복권당첨번호, 주민등록번호, 변수이름, ...
		// 수학의 집합 : 순서가 중요하지않음, 중복을 허용하지 않음.
		// 중복이 있는 데이터들이 있는데 이것을 set에 넣으면 중복이 제거됨.
		// 순서가 있는 경우에는 index활용할 수 있으나 set처럼 순서가 없으면 지시자를 활용
		
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
