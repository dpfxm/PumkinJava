package org.pumkin.day01.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String[] args) {
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하시오!
		// 문자를 입력해주세요 : a
		// 문자 출력 :
		// 1 ~ 100 사이의 숫자를 입력하세요 : 32
		// 1부터 100 사이의 숫자인가? true

		Scanner input = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 숫자를 입력하세요: ");
		int num = input.nextInt();

		boolean result1;
		result1 = (1 <= num) && (num <= 100);
		System.out.println("1부터 100 사이의 숫자인가? " + result1);

		input.close();
	}
}
