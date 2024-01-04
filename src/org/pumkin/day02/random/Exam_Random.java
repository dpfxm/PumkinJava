package org.pumkin.day02.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String[] args) {
		Random rand = new Random();
		// 0부터 n-1까지의 랜덤한 수 리턴!
		// 0부터 9까지
		System.out.println(rand.nextInt(10));

		// 1부터 10까지
		System.out.println(rand.nextInt(10) + 1);

		// 25부터 35까지
		System.out.println(rand.nextInt(11) + 25);
	}
}
