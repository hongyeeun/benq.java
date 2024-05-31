package org.yen.day11.oop.interfacepkg.music;

public class Musician {
	//다향성 (musician이 다 하는 느낌 말고 이렇게 클래스 나눠서..)
 	void play(Instrument instrument) {
		instrument.play();
	}
	
//	public static void play(Drum drum) {
//		System.out.println("두둥탁-!");
//	}
//
//	public static void play(Guitar guitar) {
//		System.out.println("딩가딩가~♬");		
//	}
//
//	public static void play(Piano piano) {
//		System.out.println("도레미~♪");
//	}

}
