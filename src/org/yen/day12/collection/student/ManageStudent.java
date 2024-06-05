package org.yen.day12.collection.student;

import java.util.ArrayList;
import java.util.List;

// 인터페이스 상속
public class ManageStudent implements ManageInterface {

	List<Student> sList;
	
	public ManageStudent() {
		sList = new ArrayList<Student>();		// 생성자 안에서 초기화. 이걸 꼭 해야한다.
												// 안하면 null 로 나옴
	}
	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public List<Student> searchListByName(String name) {
	    List<Student> search = new ArrayList<>();
	    for (Student student : sList) {
	        if (student.getName().equals(name)) {
	            search.add(student);
	        }
	    }
	    return search;
	}
	
	@Override
	public Student searchOneByName(String name) {
	    List<Student> search = new ArrayList<>();
	    for (Student student : sList) {
	        if (name.equals(student.getName())) {
	            return student;
	        }
	    }
	    return null;
	}
	
	@Override
	public List<Student> selectAllStudents() {
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {	
		sList.set(index, student);
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
	}
	
//	public String checkPass(Student std) {
//		int first = std.getFirstScore();
//		int second = std.getSecondScore();
//		// 평균이 60점이 넘으면 통과
//		// 평균이 60점이 안되면 재평가
//		double avg = (first+second)/2.0;
//		if(avg>=60) {
//			if(first<40) {
//				return "1차 시험 재평가";
//			} else if(second<40) {
//				return "2차 시험 재평가";
//			} else {
//				return "모두 통과입니다.";
//			}
//		} else {
//			if(first<60) {
//				return "1차 시험 재평가";
//			} 
//			if(second<60) {
//				return "2차 시험 재평가";
//			}
//		}
//		return null;
//	}
}
