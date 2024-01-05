package org.pumkin.day08.oop.polymorphism.overriding;

class Super {
	protected int money;

	public Super() {
		money = 100000000;
	}

	public void manageStore() {
		System.out.println("매장운영 st : 고객만족");
	}
}

class Sub extends Super {
//	다형성 사례 2
//	메소드 오버라이딩
//	접근지정자, 반환형, 메소드명 모두 일치 요구
//	실행문마다 달라지는 것
//	오직 상속관계에서 볼 수 있음
	public void manageStore() {
		System.out.println("매장운영 st : 매출상승");
	}
}

public class Exam_Overriding {
//	1. 오버라이딩은 상속관계에서 사용가능
//	2. 오버라이딩은 다 똑같고(접근지정, 반환형, 메소드명, 매개변수)
//	   실행문만 재정의
//	3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음

//	-  동적바인딩이란? 
//	   부모가 가지고 있는 메소드와 자식이 가지고 있는 메소드가 충돌된다면
//	   생성한 (자식)객체는 재정의 된 메소드를 우선으로 출력한다는 것

	static void paint(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		Shape shape = new Shape();
		Circle circle = new Circle();
		paint(shape);
		paint(circle);
		paint(new Line());
		paint(new Rectangle());
	}
//		Sub s = new Sub();
//		s.manageStore();
//		Circle c = new Circle();
//		Line l = new Line();
//		Rectangle r = new Rectangle();

//		오버라이딩 된 메소드는 이전 내용으로 실행할 수 없음
//		c.draw();
//		l.draw();
//		r.draw();
//	}
}