package org.yen.day17.socket.chatting;

import java.io.*;		
import java.net.*;
import java.util.*;

public class ChattingServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9999;
		// 포트 값 생성 -> 서버소켓에 넣음
		InputStream is = null;	// 주스트림
		OutputStream os = null;
		DataInputStream dis = null;	// 보조스트림
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다....");
			socket = serverSocket.accept();
			//  클라이언트의 연결을 기다리는 메소드
			is = socket.getInputStream();
			os = socket.getOutputStream();
			// 주스트림으로 socket스트림 생성
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 보조 스트림(data~)은 주스트림으로부터 받는다. (생성)
			System.out.println("클라이언트와 연결이 되었습니다.");
			// 반복은 우선 입출력스트림 설정한 뒤에, 
			// 값 주고 받을 때 해준다.
			while(true) {
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();	// 서버가 클라이언트에 보낸다.
				dos.writeUTF(sendMsg);	// 보내는 것이므로 dos 사용하고 write사용함.
				if("end".equals(sendMsg)) {
					System.out.println("채팅이 종료되었습니다.");
					break;
				}
				dos.flush();	// 보내주고 flush 해줘야함.
				// 클라이언트가 준 sendMsg를 받는다. 
				String recvMsg = dis.readUTF();
				System.out.println("클라이언트(상대) : " + recvMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
