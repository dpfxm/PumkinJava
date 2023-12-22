package org.pumkin.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 단항 연산자
		// a++, ++a -> a = a +1; 
		// 전위연산, 후위연산
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1--);
		System.out.println(a1);
		
		// 문제 1
		// a = 10, b = 20, c = 30
		int a = 10;
		int b = 20;
		System.out.println("a = " + a++);
		System.out.println("b = " + ((--a) + b));
		System.out.println("c = " + ((a++) + (--b)));
		
		// 문제 2
		// x = 100, y = 33, z = 0
		int x = 100;
		int y = 33;
		
		System.out.println("x = " + x--); //
		System.out.println("z = " + (x-- + --y)); //
		System.out.println("x = " + (99 + x++ + x)); //
		System.out.println("y = " + (y-- + y + ++y)); //
	}
}
