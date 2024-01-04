package org.pumkin.day01.operator;

public class Exam_Comparison {
	public static void main(String[] args) {
		System.out.println("비교연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);
		result = (num1 < num2);
		result = (num1 == num2);
		result = (num1 != num2);
		System.out.println("result: " + result);
	}
}