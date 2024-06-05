package org.yen.day12.collection.list;

class Member{
	
}
// 배열의 한계
//배열은 1개의 데이터타입에 대해서
//여러개의 데이터를 넣을 수 있음.
//-> 1개의 데이터타입에 대해서만 넣을 수 있는 것이 배열의 한계임 (Memberlist는 member만 넣을 수 있다..)
// 이러한 단점을 극복하려면 데이터 타입을 모든 클래스의 상위버전인 Object로 변환하면 된다.



// 얘는 type이 Member이므로 int대신 memeber 
public class MemberList {
	Member members[];
	int size;
	
	public MemberList() {
		members = new Member[3];
		size = 0;
	}
	// 추가
	public void add(Member member) {
		members[size] = member;
		size++;
	}
	// 조회
	public Member get(int index) {
		return members[index];
	}
	// 크기
	public int size() {
		return size;
	}
	// 전체삭제
	public void clear() {
		members = new Member[3];
		size = 0;
	}
}


