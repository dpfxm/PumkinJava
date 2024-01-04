package org.pumkin.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String[] args) {
		// 커피 메뉴를 입력 받고 가격을 알려주는
		// 프로그램을 작성하여라
		// 주문하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 3500원입니다.

		// 메뉴를 입력해주세요 : 큐브라떼
		// 없는 메뉴입니다.

		// switch ~ case
		// switch(변수명) {
		// case 값1 : 실행문; break;
		// case 값2 : 실행문; break;
		// case 값3 : 실행문; break;
		// case 값4 : 실행문; break;
		// default : 실행문; break; else와 같은 역할
		// }

		Scanner menu = new Scanner(System.in);

		System.out.println("주문하시겠어요?");
		String name = menu.next();

		int price = 0;

		// switch + 모델방식
		switch (name) {
		case "에스프레소":
			price = 2500;
			break;
		case "카푸치노":
			price = 4000;
			break;
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 3000;
			break;
		default:
			System.out.println("없는 메뉴입니다.");
			break;
		}
		System.out.println(price + "원입니다.");

		// if문
		if (name.equals("에스프레소")) {
			System.out.println("2500원입니다.");
		} else if (name.equals("카푸치노")) {
			System.out.println("4000원입니다.");
		} else if (name.equals("카페라떼")) {
			System.out.println("3500원입니다.");
		} else if (name.equals("아메리카노")) {
			System.out.println("3000원입니다.");
		} else {
			System.out.println("없는 메뉴입니다.");
		}

		// 모델방식
		if (name.equals("에스프레소"))
			price = 2500;
		else if (name.equals("카푸치노"))
			price = 4000;
		else if (name.equals("카페라떼"))
			price = 3500;
		else if (name.equals("아메리카노"))
			price = 3000;
		else
			System.out.println("없는 메뉴입니다.");
		System.out.println(price + "원입니다.");

		menu.close();
	}
}
