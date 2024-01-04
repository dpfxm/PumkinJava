package org.pumkin.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answer = 0;

		while (true) {
			System.out.print("정수 입력 : ");
			int first = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int second = sc.nextInt();
			System.out.print("연산자 입력(+, -, *, /, %) : ");
			char operator = sc.next().charAt(0);

			switch (operator) {
			case '+':
				System.out.println(first + " + " + second + " = " + (first + second));
				break;
			case '-':
				System.out.println(first + " - " + second + " = " + (first - second));
				break;
			case '*':
				System.out.println(first + " * " + second + " = " + (first * second));
				break;
			case '/':
				System.out.println(first + " / " + second + " = " + (first / second));
				break;
			case '%':
				System.out.println(first + "  " + second + " = " + (first % second));
				break;
			}
		}

//	    int result = 0;
//	    switch(operator) {
//	        case '+' : result = num1 + num2; break;
//	        case '-' : result = num1 - num2; break;
//	        case '*' : result = num1 * num2; break;
//	        case '/' : result = num1 / num2; break;
//	        case '%' : result = num1 % num2; break;
//	    }
//	    System.out.printf("결과값 : %d", result); or System.out.printf("%d %c %d = %d\n", first, operator, second, answer);
	}
}
