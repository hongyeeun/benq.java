package org.yen.day09.oop.encapsulation;

public class Book {
	
	public static void main(String[] args) {
		//	필드에 직접 접근 ( 옳지 않음)
//		Book book = new Book();
//		book.title="춘향뎐";
//		book.author="작자미상";
		// main 이 지금 같은 클래스 안에 있으므로 동작하는거지만
		// 다른 클래스에 존재한다면 title, author이 private이므로 동작하지 않는다.
		
		// 필드에 직접 접근하지 않고 객체 초기화하는 방법
		// 1. 생성자를 통해서 초기화
		Book book = new Book("춘향뎐", "작자미상");
		
		// 2. setter() 메소드를 이용한 초기화
		Book bookbook = new Book();
		bookbook.setTitle("춘향뎐");
		bookbook.setAuthor("작자미상");
		
		// 이렇게 두 가지 방법으로 초기화 할 수 있다. (직접 접근은 x)
	}
	
	private String title;
	private String author;
	
	public Book() {
		this("",""); //this 키워드로 다른 생성자 호출
	}		
	
	public Book(String title, String author) {
		this.title = title;	 //위에 string title 
		this.author = author;
	}	
	
	// setter, getter 메소드들 사용하는 이유
	// -> 필드에 직접 접근하지 못하게 하고 우회해서 접근하게 하려고(중요)
	
	// 만드는 규칙
	// 1. set을 쓰고 필드명을 낙타표기법으로 써줌
	// ex) 필드가 name이면 setter() 메소드는 setName() 가 됨
	// 2. get을 쓰고 필드명을 낙타표기법으로 써줌
	// ex) 필드가 age이면 getter() 메소드는 getAge() 가 됨
	
	// setter()메소드 -> 괄호 안에 변수형+자료값 넣어야함
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	// getter() 메소드 -> return 이랑 같이 쓰이므로 void 대신 자료형
	// private한 필드를 꺼낸다
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}

}
