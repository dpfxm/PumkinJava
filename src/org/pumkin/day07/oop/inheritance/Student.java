package org.pumkin.day07.oop.inheritance;

public class Student extends Person{
	void set() {
		super.name = "일루미";
		super.age = 31;
		super.height = 187;
		super.setWeight(75);
	}
}