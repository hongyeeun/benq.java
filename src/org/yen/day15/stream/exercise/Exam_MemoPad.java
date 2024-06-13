package org.yen.day15.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {		
		/*
		 * 1. 어떤 스트림을 쓸까?
		 * 2. 입력받은 값은 어떻게 파일에 저장할까? 
		 * 3. 입력받은 값이 exit 면 종료하는 방법은? 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력(확장자 제외) : ");	// 가이드 메시지
		String fileName = sc.nextLine();	// 파일명 입력받음
		String dest = "src/org/yen/day15/stream/exercise/" + fileName + ".txt";
		// 입력받은 파일명 fileName에 ".txt"를 추가하여 dest 변수에 저장합니다. 
		// 입력받은 파일명으로 해당 경로 셋팅
		Writer writer = null;	// 출력스트립 준비
		try {
			writer = new FileWriter(dest);	 // 파일이 만들어지고 입력받을 준비 완료 
			System.out.println("종료는 exit");
			for(int i=1; ; i++) {			// 무한반복 i는 1부터 시작하여 출력에서 사용
				System.out.print(i+" : ");
				String input = sc.nextLine();	// 저장할 데이터 입력
				if("exit".equals(input)) break;	// 널포인터익셉션 방지, exit 입력 시 무한반복문 탈출
				writer.write(input+ "\n");	// 해당 경로 파일에 저장.. input값을 저장한다.
				writer.flush();		// 버퍼 비우기
			}
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();	// 스트림 자원 해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//저장할 파일 입력(확장자 제외) : snow
		// 종료는 exit
		// 1 : 오늘은
		// 2 : 눈이
		// 3 : 옵니다.
		// 4 : 펑펑
		// 5 : 옵니다.
		// 6 : exit
		// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
		// snow.txt -> 오늘은 \n 눈이 \n 옵니다 \n 펑펑 \n 옵니다