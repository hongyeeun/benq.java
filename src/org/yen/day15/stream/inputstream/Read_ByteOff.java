package org.yen.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read_ByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src\\org\\yen\\day15\\stream\\inputstream\\reading.txt");
			int readCount;	// readCount는 읽은 갯수
			byte [] readBytes = new byte[3];
			String result = "";
			while(true) {
				readCount = is.read(readBytes, 0, 3);
				// 1부터 2까지 읽게 커스텀마이징을 해준다. (이렇게 조절할 수 있다.)
				if(readCount ==-1 ) break;
				result += new String(readBytes, 0, readCount);
			}
			is.close();	
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 안하든 반드시 실행하는 코드
			// 파일을 닫는다. 닫는 과정에도 오류가 생길 수 있으므로 추가적인 예외처리를 fianlly 해줌
			try {
				is.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
