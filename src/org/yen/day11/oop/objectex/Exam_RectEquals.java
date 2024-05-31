package org.yen.day11.oop.objectex;

class Rectangle {
	int width, height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle rect = (Rectangle)obj; 	//다운캐스팅
		if(width == rect.width && height == rect.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class Exam_RectEquals {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5,7);
		Rectangle rect2 = new Rectangle(35,1);
		if(rect1 == rect2) {}	//주소는 다를테니 이렇게 비교 안됨
		if(rect1.equals(rect2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		// 다릅니다로 뜸 -> why? : 주소가 달라서 다르게 나옴.. 
		//각각의 값끼리 같을때 비교하는 것이 아니므로 오버라이딩해줘서 다르게 메소드를 정해야함
	}

}
