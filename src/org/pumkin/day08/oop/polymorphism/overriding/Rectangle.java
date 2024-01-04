package org.pumkin.day08.oop.polymorphism.overriding;

//Shape를 상속받은 후 draw() 메소드를 오버라이딩 헤보세요
//Draw Rectangle
public class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}
