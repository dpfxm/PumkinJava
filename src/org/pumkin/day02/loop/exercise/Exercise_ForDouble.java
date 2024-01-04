package org.pumkin.day02.loop.exercise;

public class Exercise_ForDouble {
	public static void main(String[] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆에 4단으로 출력

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int answer = 0;
				answer = i * j;
				System.out.print(j + " * " + i + " = " + answer);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}