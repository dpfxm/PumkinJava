package org.pumkin.day08.oop.polymorphism.overriding;

public class Shape {
	private String name; // 외부에서 접근할 수 없는 캡슐화

//	생성자
	public Shape() {
	}

	public void draw() {
		System.out.println("shape Something");
	}

//	getter 메소드
	public String getName() {
		return this.name;
	}

//	setter 메소드: 반환값이 필요 없고 name값을 넣어주기만 하면 됨
	public void setName() {
		this.name = name;
	}
}
