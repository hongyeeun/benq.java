package org.yen.day16.socket.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888; // 포트번호 지정
		try {
			serverSocket = new ServerSocket(port);	// port를 안에 넣어준다.
			System.out.println("클라이언트의 연결을 기다리고 있습니다.. ");
			Socket socket = serverSocket.accept();	
			// accept() 의 return값이 new socket임 (수락?연결?)
			System.out.println("연결이 완료되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
