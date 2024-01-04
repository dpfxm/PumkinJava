package org.pumkin.day01.basic;

public class Exam_Variable {
	public static void main(String[] args) {
		// 숫자(정수, 실수), 문자, 문자열
		// 자바는 타입을 정해놓고 정해진 데이터로 초기화 해야함
		// Type mismatch : cannot convert from A to B
		int a = 1; // 소수점 입력하면 오류남
		char b = 'B'; // 문자열 입력하면 오류남
		String c = "Hello"; // 숫자 입력하면 오류남
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
