package org.yen.day10.oop.member.practice;

public class MemberRun {
	public static void main(String[] args) {
		ViewMember view = new ViewMember();
		Member member = new Member();
		end:
		while(true) {
			switch(view.printMenu()) {
			case 1:
				view.inputMember();
				break;
			case 2:
				// 회원검색
				break;
			case 3:
				// 회원전체조회
				break;
			case 4:
				// 종료
				break end;
			default:
				view.printMessage("1~4의 숫자만 입력하세요");
			}
		}
	}
}
