package org.pumkin.day08.oop.abstractpkg;

class Line extends Shape {
//	추상메소드는 오버라이딩이 강제된다
//	The type Line must implement the inherited abstract method Shape.draw()

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}
}

//추상 메소드가 있는 클래스는 추상 클래스가 됨
//추상 클래스가 꼭 추상 메소드를 가져야되는 것은 아님
//즉, 추상 클래스이지만 일반 메소드를 가질 수도 있다는 것
public abstract class Shape {
	private String name;

	public Shape() {
	}

//	몸체 없는 추상 메소드로 작성 -> 오버라이딩을 강제하는 효과
	abstract public void draw();

	public void paint() {
	}
}