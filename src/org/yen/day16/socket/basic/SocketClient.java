package org.yen.day16.socket.basic;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// 연결을 시도하는 코드
public class SocketClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";	// 이 주소는 내 컴퓨터 ip 이다. (나 혼자 사용할 때) 
		int port = 8888;// port 번호 server의 것과 동일해야한다.
		try {
			Socket socket = new Socket(address, port); // 주소와 포트 넣어줌	
			System.out.println("서버와 연결되었습니다.");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}