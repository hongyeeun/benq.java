package org.yen.day10.oop.interfaceex;

// samsungphone이 phoneinteface의 것을 쓰게할 수 있음 (상속) : 오버라이딩
// interface에서는 implements를 사용한다.
public class SamsungPhone implements PhoneInterface {

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("======SAM SUNG======");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("===== S-PHONE CALL =====");
	}

}
