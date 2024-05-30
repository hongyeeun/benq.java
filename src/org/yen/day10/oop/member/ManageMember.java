package org.yen.day10.oop.member;

public class ManageMember {
	//private Member member;	// 원래는 이렇게 쓰는건데 
	private Member[] members;	// 배열이면 이렇게	
	private int index;
	
	public ManageMember() {
		members = new Member[5];	// 생성자 안에서 배열 생성
		index = 0;
	}
	
	public void registerMember(Member member) {
//		this.member = member;
		if(index<members.length) {
			members[index] = member;	// 배열 하나하나에 member한명씩 넣는다.
			index++;
		}
	}
	public Member[] allMember() {
//		return member;
		return members;
	}

	public Member searchOneById(String memberId) {
		for(Member member : members) {
			if(member!=null && memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}
}
