package org.pumkin.day02.loop;

public class Exam_ForDouble {
	public static void main(String [] args) {
		// 1 * 1 = 1, 1 * 2 = 2, 1 * 3 = 3, ... 1 * 9 = 9
		// 2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6, ... 2 * 9 = 19
		// 3 * 1 = 3, 3 * 2 = 6, 3 * 3 = 9, ... 3 * 9 = 27
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int answer = 0;
				answer = i * j;
				System.out.print(i + " * " + j + " = " + answer);
				System.out.print("\t");
			} System.out.println();
		}
	}
}
