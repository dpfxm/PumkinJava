package org.pumkin.day01.basic;

public class Exam_constant {
	public static void main(String [] args) {
		// 변수는 소문자로 시작
		// 상수는 모두 대문자
		
		final double PI = 3.14;	// 고정되는 변하지 않는 수로 쓰고 싶다면 대문자로 쓰는 것이 약속
		//System.out.println(PI);
		// 상수는 재할당 불가능 -> 변하지 않는 수 -> 상수
		
		// 원의 넓이 구하는 식
		// PI * r * r
		double r = 10.31;
		double circleArea = r * r * PI;
		System.out.println("원의 면적 : " + circleArea);
	}
}
