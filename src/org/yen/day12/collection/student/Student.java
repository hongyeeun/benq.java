package org.yen.day12.collection.student;

public class Student {
	// 이름
	// 점수1
	// 점수2
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	// object가 가지고 있는 toString 오버라이딩
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
	// hashCode를 오버라이딩해서 고유값을 새로 설정
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.name+this.firstScore+this.secondScore).hashCode();
//		return super.hashCode();
	}
	
	// student의 매개변수값이 동일하면 같은 객체로 생각하게끔
	// 오버라이딩 해준다.
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std = (Student)obj;	// obj를 다운캐스팅함
			return this.hashCode() == std.hashCode();	// 밑의 것과 같다.
//			if(name.equals(std.getName())
//					&& firstScore == std.getFirstScore()
//					&& secondScore == std.getSecondsScore()) {
//				return true;
//			} else {
//				return false;
		} else {
			return false;
		}
	}
}