package org.yen.day11.oop.member;

import java.util.Scanner;

public class ViewMember {

	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원 전체정보 조회");
		System.out.println("4. 회원정보수정");
		System.out.println("5. 회원정보삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int input=sc.nextInt();
		return input;
	}
	//메시지 출력
	public void displayMessage(String msg) {
		System.out.println(msg);
	}
	// 회원정보 입력
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원가입 =======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		// 주소는 nextLine을 사용하므로 띄어쓰기 문제가 있으므로
		// 그 전에 sc.nextLine을 한번 더 써줘서 밀리는 걸 방지한다.
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
		// Member member = new Member에서 r쪽에 커서냅두고 컨트롤스페이스하면 자동생성가능하다
		// 이렇게 만들어진 걸 하나로 쓸 수 있다. (위에거)
//		Member member = new Member();		//member객체 생성
//		member.setMemberName(memberName);	//member의 값을 설정해줌
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
//		member.setMemberAddress(memberAddress);
		return member; 		// return memberName~~, memberPhone; // 이렇게 하고 싶으나 그럴 순 없다. (형식이 Member이므로)

	}

	public void printAllMembers(Member[] members) {
		System.out.println("=====회원 전체정보 출력=====");
		for(Member member:members) {
			// 하나만 입력하면 다음건 null로 나오는데, 만약 if문을 안쓰면 null 까지 나온다.
			// 따라서 null이 아닌것만 출력하게 한다.
			if(member!=null)			
				System.out.println(member.toString());
		}
		
	}

	public String inputEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이메일 입력 :");
		String email = sc.next();
		return email;
	}

	public void printOneMember(Member member) {
		System.out.println("==== 회원 검색 결과 ====");
		System.out.println("이름 : "+member.getMemberName());
		System.out.println("전화번호 : "+member.getMemberPhone());
		System.out.println("주소 : "+member.getMemberAddress());
		System.out.println("이메일 :"+member.getMemberEmail());
	}
//	public String inputEmail(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	// 객체배열에서 객체를 이용한 수정하기
	public void modifyMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원수정 =======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		member.setMemberName(memberName);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		
	}
	// 새로운 객체 만들어서 수정하기
	public Member modifyMember(String memberemail) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원수정 =======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
		return member;
	}
}
