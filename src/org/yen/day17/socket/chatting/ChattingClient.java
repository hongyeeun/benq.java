package org.yen.day17.socket.chatting;

import java.io.*;		
import java.net.*;
import java.util.*;
//.*; 은 해당 관련해서 모든 패키지를 사용한다.
// import 하는 것이 많으면 이렇게 하면 깔끔하게 됨

public class ChattingClient {
	public static void main(String[] args) {
		// 다른사람과 이렇게 연결도 가능하당.
		String address = "192.168.60.219";
		int port = 1234;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와 연결이 완료되었습니다.");
			while(true) {
				String recvMsg = dis.readUTF();	
				// 서버가 보낸 sendMsg를 dis 사용하여 read 메소드 이용해서 읽는다.
				if("end".equals(recvMsg)) {
					System.out.println("채팅이 종료되었습니다.");
					break;
				}
				System.out.print("서버(상대) : "+recvMsg);	// 서버가 보낸 sendMsg
				// 클라이언트에서도 마찬가지로 서버한테 보낼 수 있다. 
				System.out.println();
				System.out.print("클라이언트(나) :  ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);	// 보내는 것이므로 dos 사용하고 write사용함.
				dos.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
