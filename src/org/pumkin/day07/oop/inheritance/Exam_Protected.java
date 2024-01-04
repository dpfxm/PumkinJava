package org.pumkin.day07.oop.inheritance;

import org.pumkin.day07.oop.point.Point;

class Super {
	public int pub;
	int def;
	protected int pro; // 상속이 됐을 때만 사용 가능함
	private int pri;
}

class Sub extends Super {
	private int childMoney;

	void set() {
		super.pub = 31;
		super.def = 47;
		super.pro = 51;
//		super.pri = 61; The field Super.pri is not visible
	}
}

class ShapePoint extends Point {
	private String shape;

	void set() {
		super.pub = 1;
		// 같은 패키지가 아니기 때문에 불가능
		// The field Point.def is not visible
//		super.def = 10; 
		// 상속을 받은 클래스이기 때문에 pro필드 접근 가능
		super.pro = 17;
		// The field Point.pri is not visible
//		super.pri = 18; 
	}
}

public class Exam_Protected {

	public static void main(String[] args) {
	}
}