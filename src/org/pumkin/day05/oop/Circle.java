package org.pumkin.day05.oop;

public class Circle {
	public int radius;
	public String name; // --> 여기까지가 필드(멤버변수)

	// 생성자
	// 1. 클래스 이름과 똑같은 메소드
	// 2. 객체 생성 시 최초 1번 실행됨
	// 3. 필드값을 초기화 함 => 객체 초기화
	public Circle() { // Circle 생성자 메소드
		// int radius와 String name이 선언만 되어있고 초기화가 되어있지 않음
		radius = 1;
		name = "일루미";
	}

	public double getArea() { // getArea 메소드(생성자와 다름. 멤버메소드)
		return 3.14 * radius * radius;
	}
}
