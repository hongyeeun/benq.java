package org.yen.day16.socket.stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888; // 동시에 실행만 하지 않으면 같은 번호 사용해도 된다.
		InputStream is = null; // 바깥에서 빼서 선언한다.
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(port);	// 객체생성
			System.out.println("클라이언트의 요청을 기다리고 있습니다..");
			socket = serverSocket.accept();	
			//연결요청을 기다리고, socket에 그걸 넣어준다.?
			System.out.println("클라이언트와 연결되었습니다.");
			is = socket.getInputStream();	// 소켓스트림 사용
			//socket.getOutputStream();
			int result = is.read(); 
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
