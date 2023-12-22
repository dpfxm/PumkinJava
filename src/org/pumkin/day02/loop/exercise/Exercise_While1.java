package org.pumkin.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {
	public static void main(String [] args) {
		// While 문을 이용하여 -1이 입력될때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		
		while (true) { // white(input != -1) {
			System.out.print("정수를 입력해주세요 : ");
			int num = sc.nextInt();
			if (num == -1) break;
			sum = sum + (num);
		} System.out.println(sum);
	}
}
