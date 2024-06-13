package org.yen.day15.file;

import java.io.File;
import java.io.IOException;

// File 클래스 사용하는 이유
// File 의 정보를 사용하고 싶어서

public class Exam_File {
	
	public static void main(String[] args) throws IOException {
		File folderMake = new File("src/org/yen/day15/file/sample");
		if(!folderMake.exists()) {
			folderMake.mkdir();	//폴더 생성
			System.out.println("폴더가 만들어졌습니다.");
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		System.out.println(folderMake.getName());
		System.out.println(folderMake.isDirectory());
	}
	
	
	// 얘는 파일을 만들 때 사용한다.
	public void fileMake() throws IOException {
		File fileMake = new File("src/org/yen/day15/file/sample.txt");
		if (!fileMake.exists()) {
			fileMake.createNewFile();	// 파일생성
			System.out.println("파일이 만들어졌습니다.");
		} else {
			System.out.println("이미 파일이 존재합니다.");
		}
	}

	public void fileBasic() {
		File file = new File("C:\\Temp\\copyimg.jpg");
		// 이 파일을 읽어내서 메소드처럼 사용가능 file.~
		String fileName = file.getName();
		String path = file.getPath(); // 경로
		String parent = file.getParent(); // 상위 폴더?
		System.out.println("파일 이름 : " + fileName);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);
		System.out.println("파일이 존재하는가? : " + file.exists());
		System.out.println("파일이 맞는가? : " + file.isFile());
		System.out.println("폴더가 맞는가? : " + file.isDirectory());
	}
}
