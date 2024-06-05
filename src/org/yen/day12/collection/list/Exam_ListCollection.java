package org.yen.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

// 컬렉션 이용
// list -> 순서 중요하고, 중복이 가능 ex) 맛집 대기
public class Exam_ListCollection {

	public static void main(String[] args) {
		// List 인터페이스 존재
		// List 인터페이스를 구현하여 만든 클래스가 존재
		// ArrayList클래스라고하면 이것을 사용한다.
		List<String> list = new ArrayList<String>();		
		// List는 인터페이스여서 new를 못쓰므로 자식객체인 ArrayList로 생성한다.
		// 업캐스팅 !! 부모 = 자식 객체 로 생성~
		list.add("박건욱");
		list.add("석매튜");
		list.add("김규빈");
		list.add("리키");
		list.add("김지웅");
		list.add("성한빈");
		list.add("짱하오");
		list.add("김태래");
		list.add(2, "뽀돌이");		/// 중간에 삽입하기
		
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		System.out.println("크기 : "+list.size());
		int listSize = list.size()-1;
		System.out.println("마지막 값 : "+list.get(listSize));
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		list.remove(listSize);
		list.remove(2);
		list.clear();
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println("isEmpty() : "+list.isEmpty()+", size() :"+list.size());
	}
	
	
	public void genericSample(){
		//제네릭 <> 을 쓰면 형변환하지 않아도 됨.
		GenericList<String> strList = new GenericList<String>();
		
		strList.add("장하오");
		strList.add("김태래");
		strList.add("한유진");
		
		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		// 제네릭 없이 사용하면 형변환해줘야 됨.
		// obj에 string만 넣었어도 이렇게 형변환 시켜줘야한다.	
		ObjectList obj = new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종료");
	
		String start = (String)obj.get(0);
		String project = (String)obj.get(1);
		String end = (String)obj.get(2);
		System.out.println(start);
	}
	
	public void objListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");
		
		// objList의 인덱스 값은 각각 타입이 object이므로 
		// 각각의 형변환을 시켜줘서 나오게끔 한다.
		double start = (double)objList.get(0);
		int end = (int)objList.get(1);
		// msg로 종강 메시지가 출력되도록 적어보세요.
		String msg = (String)objList.get(2);
		
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
}
	
	
	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);		// nums[0] = 5
		nums.add(7);		// nums[1] = 7
		nums.add(1023);		// nums[2] = 1023
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : "+nums.size);
		nums.clear();
		System.out.println("크기 : "+nums.size);
	}

}
