package org.yen.day11.oop.member;

public class MemberRun {
	public static void main(String[] args) {
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		exit :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1:
				// 회원가입
				// 멤버 클래스에서 만든 member객체는 view의 inputMember메소드에서 입력받는다.
				Member member = view.inputMember();
				mng.insertMember(member);	//저장완료
				break;
			case 2: 
				// 회원검색(이메일)
				String email = view.inputEmail();	//이메일 입력
				member = mng.searchOneByEmail(email);	// 멤버찾은후에
				if(member!=null)
					view.printOneMember(member);		//멤버출력
				else
					view.displayMessage("검색결과가 없습니다.");
				break;
			case 3: 
				// 회원 전체정보 출력
				Member members[] = mng.getAllMembers();		//members[] 객체 생성
				view.printAllMembers(members);		// 객체를 출력
				break;
			case 4: 
				// 회원정보수정
				// 수정할 이메일 입력
				email = view.inputEmail();
				// 데이터 확인
				member = mng.searchOneByEmail(email);
				if(member!=null) { //있으면
					view.modifyMember(member);	//이게 더 간단하다.
					//수정할 값 입력받음
					//member = view.modifyMember(email);
					// 입력값이 완료되면 수정
					// mng.updateMember(member)
				}
				break;
			case 5: 
				// 회원 삭제
				mng.deleteAllMembers();
				break;
			case 6:
				// 회원 정보 검색하여 삭제
				// 회원 검색(이메일)
				email = view.inputEmail();
				// 검색하여 나오는 멤버
				member = mng.searchOneByEmail(email); 
				// 그 멤버 삭제하기
				if(member!=null)
					mng.deleteOneMember(member);
				else view.displayMessage("찾으려는 회원이 없습니다.");
				break;
			case 0: 
				view.displayMessage("프로그램을 종료합니다.");
				break exit;
			default : 
				view.displayMessage("잘못입력하셨습니다.");
			}
		}
	}

}
