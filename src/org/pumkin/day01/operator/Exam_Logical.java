package org.pumkin.day01.operator;

public class Exam_Logical {
	public static void main(String[] args) {
		// 논리연산자 예제
		// Oracle에서 where절 뒤에 적었던 논리 연산자 AND, OR과 같은 역할을 한다
		// Example) 30이닝 이상 출장하면서 era 2.0 이하인 투수
		// 30경기 이상 출장하면서 타율 3.00 이상인 타자

		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// num1 cannot be resolved to a variable -> 선언되지 않았는데 사용됨

		// int num1 = 51;
		// int num2 = 31;

		// resultnum1 = (num1 == num2) && (num1 < num2); // false
		// result2 = (num1 < num2) || (num1 == num2); // false
		// result3 = (num1 > num2) && (num1 != num2); // true
		// result4 = (num1 > num2) || (num1 == num2); //true

		int a = 70;
		int b = 55;

		result1 = (a == b) || (a++ < 100); // true, a = 71, b = 55
		System.out.println(result1 + ", " + a + ", " + b);

		result2 = (a < b) && (--b < 55); // false, a = 71, b = 55
		System.out.println(result2 + ", " + a + ", " + b);

		result3 = (a != b) && (b-- < a++); // true, a = 72 b = 54
		System.out.println(result3 + ", " + a + ", " + b);

		result4 = (a++ != b) || (b++ > 85); // true, a = 73, b = 54
		System.out.println(result4 + ", " + a + ", " + b);

	}
}
