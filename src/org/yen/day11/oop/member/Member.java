package org.yen.day11.oop.member;

//회원정보를 저장하는 클래스
public class Member {
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	
	public Member() {}
	
	public Member(String memberName, String memberEmail, String memberPhone, String memberAddress) {
		super();
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
	}	//매개변수가 ~한 생성자 생성 (자동완성으로 가능하다) : 한번의 식으로 가능@@


	//값을 호출
	public String getMemberName() {
		return memberName;
	}

	//값을 설정
	public void setMemberName(String memberName) {
//		if(memberName.length()>2)		이렇게 길이도 조절할 수 있음
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	// 객체가 갖고 있는 데이터 출력 -> 오버라이딩으로 재정의
	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", memberEmail=" + memberEmail + ", memberPhone=" + memberPhone
				+ ", memberAddress=" + memberAddress + "]";
	}
	
	
}
