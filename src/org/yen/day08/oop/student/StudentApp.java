package org.yen.day08.oop.student;

public class StudentApp {
	// 앞서 했던 ScoreProgram3 문을 다시 이렇게 3개의 클래스로 나뉘어본다.
	// 학생성적입출력 클래스 + 화면출력 클래스 = 메인
	public static void main(String[] args) {
		ManageStudent student = new ManageStudent(); //객체생성
		ViewStudent view = new ViewStudent();
		end :
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1 :
				student.inputScore();
				break;
			case 2:
				student.printScore();
				break;
			case 3:
				view.displayMsg("프로그램을 종료합니다");
				break end;
			default :
				view.displayMsg("1~3사이의 수를 입력해주세요");
			}
		}
	}
}
