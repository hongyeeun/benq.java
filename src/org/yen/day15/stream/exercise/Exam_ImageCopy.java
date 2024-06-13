package org.yen.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 입출력 스트리밍 통해서 복사
// inputstream으로 파일을 읽고, outputstream으로 그 파일을 써준다.
public class Exam_ImageCopy {
	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Windows\img0.jpg 의 파일을
		// C:\Windows\Temp\copyimg.jpg로 복사한다.
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			os = new FileOutputStream("C:\\Windows\\Temp\\copyimg.jpg");
			byte byteImages[] = new byte[1024]; // read할때는 byte가 꼭 필요하다.
			int readCount;	// 읽을 때는 읽은 횟수 꼭 선언해줘야한다.
			while(true) {
				readCount = is.read(byteImages);
				if (readCount == -1) break;	//readcount가 -1 이 되면 더 이상 읽을게 없으므로
				os.write(byteImages, 0, readCount);	
				// 읽은 갯수까지만 write 할 수 있도록 끝을 readCount로 설정한다.
				os.flush();	// 다 write 하면 버퍼비워주고
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		// fianlly 로 close 해줌
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
