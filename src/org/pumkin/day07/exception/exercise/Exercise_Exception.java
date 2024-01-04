package org.pumkin.day07.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
//		정수는 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를
//		출력하고 다시 입력 받는 프로그램을 작성하여라.

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.print("정수 1을 입력해주세요 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 2을 입력해주세요 : ");
				int num2 = sc.nextInt();
				System.out.println("\n나누는 중입니다! L o a d i n g . . .\n");
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다!\n\n", num1, num2, result);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("0으로 나눌 수 없습니다 T^T..\n\n");
			}
		}
	}

	public void exercise2() {
//		3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
//		사용자가 정수가 아닌 문자를 입력할 때 발생하는
//		InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.

		while (true) {
			Scanner sc = new Scanner(System.in);
			int sum = 0;

			for (int i = 0; i < 3; i++) {
				System.out.print("정수 " + (i + 1) + "을 입력해주세요 : ");
				try {
					sum += sc.nextInt();
				} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("\n정수를 입력해주세요 T^T.. \n");
					sc.next(); // 기억이 사라지고 정수를 입력받게 해줌
					i--; // 순서를 이전으로 조정하여 정수를 입력받게 해줌
				}
			}
			System.out.printf("\n합은 %d입니다!\n\n", sum);
		}
	}

	public void exercise3() {
//		범위를 벗어난 배열의 접근
//		ArrayIndexOutOfBoundsException

		int intArrs[] = new int[5];
		try {
			System.out.println(intArrs[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}

	public void exercise4() {
//		정수가 아닌 문자열을 정수로 변환할 때 예외 발생
//		String -> Int
//		NumberFormatException

//		Exception in thread "main" java.lang.NumberFormatException: For input string: "11.13"
//		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//		at java.base/java.lang.Integer.parseInt(Integer.java:652)
//		at java.base/java.lang.Integer.parseInt(Integer.java:770)
//		at org.pumkin.day07.exception.exercise.Exercise_Exception.exercise4(Exercise_Exception.java:77)
//		at org.pumkin.day07.exception.run.Run.main(Run.java:11)

		String[] str = new String[2];
		str[0] = "51";
		str[1] = "11.13";

		try {
			int result0 = Integer.parseInt(str[0]);
			System.out.printf("숫자로 변환된 값은 %d입니다.\n", result0);
			int result1 = Integer.parseInt(str[1]);
			System.out.printf("숫자로 변환된 값은 %d입니다.\n", result1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다!");
		}
	}

	public void exercise5() {
//		Null 값을 참조할 때 발생
//		NullPointerException
//		Null pointer access: The variable str can only be null at this location

//		Exception in thread "main" java.lang.NullPointerException
//		at org.pumkin.day07.exception.exercise.Exercise_Exception.exercise5(Exercise_Exception.java:99)
//		at org.pumkin.day07.exception.run.Run.main(Run.java:12)

		try {
			String str = null;
			if (str.equals("null")) {
				System.out.println("같습니다.");
			} else {
				System.out.println("다릅니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null 값을 참조하였습니다.");
		}
	}
}