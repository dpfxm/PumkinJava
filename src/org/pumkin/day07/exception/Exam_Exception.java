package org.pumkin.day07.exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {

//		num1 = 10, num2 = 0;
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at org.pumkin.day07.exception.Exam_Exception.main(Exam_Exception.java:14)

		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("나눠드릴게요. 조금만 기다리세요!");
			int result = num1 / num2;
			System.out.printf("몫은 %d입니다.", result);
		} catch (Exception e) {
			// TODO: handle exception
			// 20행에서 예외가 발생하면
			System.out.println("어? 0으로는 못나누는데 ..");
		}

	}
}