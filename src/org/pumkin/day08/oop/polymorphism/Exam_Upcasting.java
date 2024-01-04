package org.pumkin.day08.oop.polymorphism;

class Person {
	String name = "일루미";
	String id = "031";

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class Student extends Person {
	String grade = "4학년";
	String department = "컴퓨터공학과";

	public Student() {
	}

	public Student(String name) {
//		부모의 생성자 호출, 부모의 메소드 또는 필드 사용
		super(name);
	}
}

public class Exam_Upcasting {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
//		상속 관계인 경우 업캐스팅
//		부모 타입의 참조 변수로 자식 객체를 이용하는 것
		Person parent = new Student();
//		Student s = new Person(); --> 컴파일 오류

//		생성된 객체는 자식 객체로 보이는데 어떻게 부모 객체를 만든 것처럼
//		사용가능한가?
//		부모의 객체 먼저 생성된 후 자식 객체가 생성되니
//		부모의 필드 또는 메소드를 사용할 수 있게 되는 것
//		업캐스팅
		System.out.println(parent.name);
		System.out.println(parent.id);

//		자식 객체가 가지고 있는 grade와 department를 불러 올 수 있을까?
//		다운캐스팅
//		System.out.println(parent.grade); --> grade cannot be resolved or is not a field
		System.out.println(((Student) parent).grade); // 강제형변환
		System.out.println(((Student) parent).department); // 강제형변환
	}
}