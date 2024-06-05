package org.yen.day12.collection.student;

import java.util.List;

public class StudentRun {
	public static void main(String[] args) {
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		끝:
		while(true) {
			int input = view.printMenu();
			switch(input) {
			case 1:
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			//2. 학생 정보 이름 검색
			case 2:
				String name = view.inputName("검색"); 
				List<Student> searchstd = mng.searchListByName(name);
				view.displaySearch(searchstd);
				break;
			case 3:
				List<Student> stdList = mng.selectAllStudents();
				view.displayStudents(stdList);
				break;
			// 4. 학생 정보 수정
			case 4:
				int modifyIndex = view.inputIndex();
				Student modifystd = view.inputStudent();
				mng.modifyStudent(modifyIndex, modifystd);
				break;
			// 5. 학생 정보 삭제
			case 5:
				int deleteIndex = view.inputIndex();
				mng.deleteStudent(deleteIndex);
				break;
			// 6. 재평가 대상 여부 확인
			case 6:
				name = view.inputName("재평가 여부를 확인");
				std=mng.searchOneByName(name);
				//String passResult = mng.checkPass(std);	mng안에 넣는 방법
				String passResult = checkPass(std);  
				// 밑에다 메소드 적는 방법
				view.displayMsg(passResult);
				break;
			case 0:
				view.displayMsg("프로그램을 종료합니다.");
				break 끝;
			default:
				view.displayMsg("1~3사이의 수를 입력해주세요");
			}
		}
	}

	// 재평가 기준 설명
	// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
	// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
	// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
	// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의
	// 과목은 재평가를 본다.
	// 1차 점수 : 60점, 2차 점수 : 60점
	// 1차 점수 : 100점, 2차 점수 : 20점(2차만 재평가)
	// 1차 점수 : 59점, 2차 점수 : 60점(1차만 재평가);
	// 결론 : 평균 60점이 넘어야함, 넘었는데 재평가보는 경우있음.
	// 평균 60점이 넘지 않으면 재평가(60점 미만만 재평가)
	
	public static String checkPass(Student std) {
		int first = std.getFirstScore();
		int second = std.getSecondScore();
		// 평균이 60점이 넘으면 통과
		// 평균이 60점이 안되면 재평가
		double avg = (first+second)/2.0;
		if(avg>=60) {
			if(first<40) {
				return "1차 시험 재평가";	//sys해도 괜찮긴하지만 원칙은 return
			} else if(second<40) {
				return "2차 시험 재평가";
			} else {
				return "모두 통과입니다.";
			}
		} else {
			String result = "";
			if(first<60) {
				result += "1차 시험 재평가";
			} 
			if (second<60) {
				result += "2차 시험 재평가";
			} return result;
		} 
	}
}

//		} else {
//			if(first<60 && second>=60) {
//				return "1차 시험 재평가";
//			} 
//			else if(first>=60 && second < 60 ) {
//				return "2차 시험 재평가";
//			} else return "모두 재평가입니다.";
//		}
