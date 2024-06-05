package org.yen.day12.collection.student;

import java.util.List;

public interface ManageInterface {
	void registerStudent(Student student);
	
	List<Student> searchListByName(String name);
	
	List<Student> selectAllStudents();
	
	void modifyStudent(int index, Student student);
	
	void deleteStudent(int index);

	Student searchOneByName(String name);
	// 새로 메소드 적어줬으면 인터페이스에도 적어줘야함
	// 인터페이스는 보통 안적음 @_@
}
