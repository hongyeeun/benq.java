package org.yen.day14.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	// 년 월일 시분초
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = trans.format(date);	// date를 trans로 형식변환함
		System.out.println("형식 변환1: "+transDate1);
		String transDate2 = trans2.format(date);
		System.out.println("형식 변환 "+transDate2);
		
		// calendar 은 추상이라, 기본 생성자 생성기능 x
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : "+changed);
	}

}
