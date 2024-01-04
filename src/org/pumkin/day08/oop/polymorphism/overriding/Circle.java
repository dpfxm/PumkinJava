package org.pumkin.day08.oop.polymorphism.overriding;

//Circle이 Shape를 상속 받으려고 한다면, 어떻게 해야하나요?
public class Circle extends Shape {
	public void draw() {
		System.out.println("Draw Circle");
	}
}
