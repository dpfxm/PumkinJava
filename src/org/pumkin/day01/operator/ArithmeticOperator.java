package org.pumkin.day01.operator;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		// 초 단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지 출력하는 프로그램
		// 을 작성하라
		Scanner sc = new Scanner(System.in);
		// 정수를 입력하세요 : 5000
		// 5000초는 1시간, 23분, 20초입니다.
		System.out.print("정수(초)를 입력하세요 : ");
		int time = sc.nextInt();

		int hour = time / 3600; // or time / 60 / 60
		int min = (time / 60) % 60;
		int sec = time % 60;

		// 1분 60초 -> 1시간 3600초

		System.out.println(hour + "시간, " + min + "분, " + sec + "초입니다.");

		sc.close();
	}
}
