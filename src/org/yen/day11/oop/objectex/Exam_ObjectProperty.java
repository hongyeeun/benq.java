package org.yen.day11.oop.objectex;

class Member {
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public Member() {}	//기본생성자는 필수로 쓰고 필요할 때 생성자 추가해서 사용하자.
	
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}	//오버로딩:매개변수 추가하여 기본생성자와는 다르게 쓸 수 있다.

	@Override
	public String toString() {
		//return super.toString();	
		// super~:즉 object(부모)의 tostring을 쓰겠다. object에게 이미 상속되어 있음
		// 그러나 의미있게 쓰려면 바꿔줘야함 -> 자주 쓰임
		 return "이름 : " + name + ", 나이 : " + age + ", 이메일 : " +email
				 +", 전화번호 :" + phone + ", 주소 : " +address;
	}
}
public class Exam_ObjectProperty {

	public static void print(Object obj) {
		System.out.println("클래스 이름 : "+obj.getClass().getName());
		System.out.println("해시 코드값 : "+obj.hashCode());
		// 의미있는 데이터로 만들어 출력하고 싶다면 오버라이딩 필수 !
		System.out.println("객체를 문자열로 만들어 출력 : "+obj.toString());
		//System.out.println("객체 출력 : "+obj);		// toStrubg() 생략 가능함.
													// 객체를 출력하면 toString() 의 결과로 출력됨
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Member("일용자", 11, "khuser01@naver.com", "01033332222", "서울시 중구"));
		print(new Member("이용자", 22, "kh02@gmail.com", "01022221111", "대전"));
		print(new Member());	//값을 안주면 null과 0으로 나옴
		//생성된 객체는 주소값이 다 다를 수 있다.
		
		String javaStr = "Java";
		String javaStr2 = new String("Java");	// 앞서 javaStr에서 만든 Java객체 말고 new를 통해 새로운 객체를 생성했다.
		String javaStr3 = "Java";	//javaStr에서 만든 Java 주소를 재사용했다.
		// 문제
		// if(jvaStr==javaStr3) { -> true , 왜 같아요? 주소가 똑같아서요, (feat.상수풀)
		// if(jvaStr3==javaStr2) { -> false, 왜 달라요? javaStr2에서 주소를 새로 생성했으므로 다르다. (이름만 동일)
		// if(jvaStr3=="Java") { -> true
		// if(jvaStr=="javA") { -> false, 문자열이 다름 
		System.out.println("javaStr : "+ javaStr + ", javaStr2 : "+ javaStr2);
		if(javaStr2=="Java") {
			// 이미 Java에는 javaStr로 저장되어 있으므로 javaStr2의 주소는 Java가 아니다.
			System.out.println("똑같습니다.");
		} else {
			System.out.println("다릅니다.");		//결과는 다릅니다
		}
		
		// 주소와 상관없이 알맹이만 비교할 땐 equals 사용
		if("Java".equals(javaStr2)) {				// 문자열 비교는 equlas
			System.out.println("똑같습니다.");		// equals는 Object클래스의 메소드
		} else {
			System.out.println("다릅니다.");
		}
	}
}
