package org.yen.day12.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	public IntList() {			// 생성자는 멤버필드를 초기화한다.
		nums = new int[3];		// int nums[] = new int[3]; 식으로 위에서 초기화해도 되나
		size = 0;				// 이렇게 생성자안에서 초기화하는게 공식
	}
	
	// void 메소드는 괄호 안에 매개변수 넣을때 타입 넣어야함
	public void add(int num) {
		nums[size] = num;
		size++;
	}
	// 전체값을 가져올 때는 매개변수가 필요 없다.
	// 그런데 1개의 값을 가져올때는 그 위치가 필요하므로 매개변수 필요함.
	public int get(int index) {
		// return nums; // 이건 매개변수가 필요 없다. 
		// nums를 return 할때는 int[] : 리턴값의 자료형
		return nums[index];	// int : 리턴값의 자료형
	}
	public int size() {
		return size;
	}
	public void clear() {
		// 1. for문 돌면서 초기화
		// 2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
	
}
