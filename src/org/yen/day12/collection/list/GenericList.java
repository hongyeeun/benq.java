package org.yen.day12.collection.list;

// 여기서 T는 타입을 의미한다.
public class GenericList<T> {
	Object [] objects;
	int size;
	
	public GenericList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T object) {
		objects[size] = object;
		size++;
	}
	
	//T로 형변환
	public T get(int index) {
		return (T)objects[index];
	}
	
	public int size() {
		return size;
	}
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}

