package org.yen.day16.socket.calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {
	public static void main(String[] args) {
		// serverSocket과 socket둘다 생성
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 8989;
		InputStream is = null;
		OutputStream os = null;	// 계산한 result값을 다시 보내줘야함 output
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port); // 서버소켓 생성
			System.out.println("연결을 기다리고 있습니다.");
			socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다.");
			// 클라이언트에서 준 거 input 함
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				String recvMsg = dis.readUTF();
				if("exit".equals(recvMsg)) break;
				System.out.println(recvMsg);
				String data[] = recvMsg.split(" ");
				int num1 = Integer.parseInt(data[0]);
				int num2 = Integer.parseInt(data[2]);
				String operator = data[1];
				String result = "";
				switch(operator) {
					case "+" : result = num1 + num2 + ""; break;
					case "-" : result = num1 - num2 + ""; break;
					case "*" : result = num1 * num2 + ""; break;
					case "/" : result = num1 / num2 + ""; break;
					case "%" : result = num1 % num2 + ""; break;
				}
				dos.writeUTF(result);
				dos.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
