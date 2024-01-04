package org.pumkin.day01.inputsc;

import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈간으로 분리하여 입력하세요.");

		Scanner sc = new Scanner(System.in); // sc는 스캐너명
		System.out.print("이름을 입력해주세요: ");
		String name = sc.next();
		System.out.print("도시를 입력해주세요: ");
		String city = sc.next();
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		System.out.print("체중을 입력해주세요: ");
		double weight = sc.nextDouble();
		System.out.print("독신 여부를 입력해주세요: ");
		boolean singleYN = sc.nextBoolean();

		System.out.println("이름은 " + name + ", 도시는 " + city + " , 나이는 " + age + "살, 체중은 " + weight + "kg, 독신여부는 "
				+ singleYN + "입니다.");
		// System.out.println("이름 : " + name);
		// System.out.println("도시 : " + city);
		// System.out.println("나이 : " + age);
		// System.out.println("체중 : " + weight);
		// System.out.println("독시 : " + singleYN);

		sc.close(); // 잘못 쓰면 프로그램이 잘 작동하지 않을 수도 있음

	}
}
