package org.yen.day08.oop.student.practice;

public class StudentApp {
	public static void main(String[] args) {
		ManageStudent student = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end:
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1: 
				student.inputScore();
				break;
			case 2:
				student.printScore();
				break;
			case 3:
				view.printMessage("프로그램이 종료되었습니다");
				break end;
			default : 
				view.printMessage(" 1~3 사이의 숫자를 골라주세요");
			}
		}
	}
}
