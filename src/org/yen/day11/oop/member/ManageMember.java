package org.yen.day11.oop.member;

public class ManageMember {

	// 객체배열 (멤버배열..)
	Member members[];
	int index;
	
	// 필드초기화를 생성자에서
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	// 회원정보저장
	public void insertMember(Member member) {
		if(index<members.length) {
		members[index] = member;
		index++;
		}
	}

	// 회원 전체정보
	public Member[] getAllMembers() {
		// TODO Auto-generated method stub
		return members;
	}

	// 이메일로 회원 검색
	public Member searchOneByEmail(String email) {
		for(Member member:members) {
			if(member!=null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMembers() {
		// 다 지운다는건 비우는 것, 배열을 비운다
		// 배열을 어떻게 비울까? 
		// 초기상태로 만들기 -> 새로 하기.. index도 같이
		members = new Member[5];
		index = 0;
//		for(Member member : members) {
//			member = null;
//		}
	}
}
