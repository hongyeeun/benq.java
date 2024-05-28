package org.yen.day08.oop.objectarray.student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end:
		while(true) {
				int input = view.printMenu();
				Student students[] = null;
				switch(input) {
					case 1:
//						mng.inputInfo();
						students = view.displayInput();
						mng.inputInfo(students);
						break;
					case 2:
//						mng.printInfo();
						students = mng.printInfo();
						view.displayInfo(students);
						break;
					case 3:
						view.displayMSG("프로그램을 종료합니다.");
						break end;
					default:
						view.displayMSG("1~3사이의 숫자를 입력해주세요");
					}
				}
		}		
	}

