package org.pumkin.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 100 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 69 ~ 60 : D
		// 60점 미만 : F

		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		// 모델 방식
		char grade = 0;

		if (score < 101) {
			if (score >= 90)
				grade = 'A';
			else if (score >= 80)
				grade = 'B';
			else if (score >= 70)
				grade = 'C';
			else if (score >= 60)
				grade = 'D';
			else
				grade = 'F';
		} else {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
		}
		System.out.println("학점은 " + grade + "입니다.");

		// --

		if (score < 101) {
			if (score >= 90)
				// grade = 'A';
				System.out.println("학점은 A입니다.");
			else if (score >= 80)
				System.out.println("학점은 B입니다.");
			else if (score >= 70)
				System.out.println("학점은 C입니다.");
			else if (score >= 60)
				System.out.println("학점은 D입니다.");
			else
				System.out.println("학점은 F입니다.");
		} else {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
		} // 예외처리 필수!

		sc.close();
	}
}
