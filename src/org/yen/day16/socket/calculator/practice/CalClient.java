package org.yen.day16.socket.calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8989;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		// 바깥에다 선언
		// server로 보냄 -> output
		OutputStream os = null;
		DataOutputStream dos = null;
		// server의 result값을 다시 input시킴
		InputStream is = null;
		DataInputStream dis = null;
		try {
			socket = new Socket(address, port); // 소켓생성
			System.out.println("서버와의 연결이 완료되었습니다.");
			// 서버에 보내주므로 outputstream 사용
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			// 스트림 준비가 다 되면, 무한반복 가능하다.
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);	// 먼저 보내줘야한다.
				if("exit".equals(sendMsg)) {
					break;					// 뭐든지 보내줘야하므로 종료문은 그 후에.. 
				}
				dos.flush();
				String recvMsg = dis.readUTF();
				// dos.writeUTF(result); 을 읽음..?
				System.out.println("계산 결과 : "+ recvMsg);
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
				os.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
