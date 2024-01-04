package org.pumkin.day08.oop.abstractpkg;

public abstract class Person {
//	어차피 재정의 할 것이기 때문에 내부 코드를 쓸 필요가 없음
//	abstract을 가진 추상 메소드는 몸체({})가 없는 메소드
	abstract public void sleep();
	abstract public void eat();
	abstract public void walk();
	abstract public void speak();
}
