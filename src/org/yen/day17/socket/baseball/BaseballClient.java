package org.yen.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클라이언트소캣을 생성하였습니다.
//		
//		숫자랑 위치가 같으면 스트라이크,
//		숫자만 같으면 볼
		
//		게임 준비 완료
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 2 3 6
//		0스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 1 3 6
//		1스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 1 4 6
//		2스트라이크 0볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 6 4 1	
//		1스트라이크 1볼
//		숫자 입력(띄어쓰기로 구분) ex 1 2 3
//		--> 1 4 5
//		3스트라이크 0볼
//		아웃! 게임종료!
		String address = "127.0.0.1";
		int port = 8989;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트소캣을 생성하였습니다.");
			Thread.sleep(1000);
			System.out.println("게임 준비 완료");
			// 입출력 스트림 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			// 주석처리한건 내가 한것들 .. ㅇㅅㅇ 
// 			String recvMsg = dis.readUTF();
//			String data[] = recvMsg.split(" ");
			while(true) {
				System.out.println("숫자 입력(띄어쓰기로 구분) ex 1 2 3");
				System.out.print("--> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
//				String result[] = sendMsg.split(" ");
//				for(int i=0; i<3; i++) {
//					if(data[i].equals(result[i])) {
//						strike ++;
//					} 
//					else {
//						for(int j=0; j<result.length; j++) {
//							if(j!=i&&data[j].equals(result[i]))
//								ball++;
//						}
//					}
//				} System.out.println(strike+"스트라이크 "+ball+"볼");
//				if(strike==3) {
//					System.out.println("아웃! 게임종료!");
//					break;
//				}
//				strike = 0;
//				ball = 0;
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
