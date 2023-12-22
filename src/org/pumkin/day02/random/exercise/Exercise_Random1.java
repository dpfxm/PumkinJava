package org.pumkin.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args) {
		// 동전 앞 뒤 맞추기
		// == 동전 앞 뒤 맞추기 ==
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		// 맞췄습니다.
		
		Random coin = new Random();
		Scanner sc = new Scanner(System.in);
		
		// for 문
		// for(int i = 0; i < 10; i++) { (실행문); }
		// for(;;) { ( 실행문); } 무한반복
		for(;;) {
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
			
			int answer = coin.nextInt((2)+1);		
			int num = sc.nextInt();
			
			if (num == 1 || num == 2) {
				if (answer == num)
					System.out.println("맞췄습니다.");
				else System.out.println("틀렸습니다.");			
			} else System.out.println("1 또는 2를 입력해주세요.");			
		}
	}
}
