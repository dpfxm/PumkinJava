package org.pumkin.day01.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하시오!
		// 문자를 입력해주세요 : a
		// 문자 출력 : a
		// 영어 대문자 확인 : false
		
		Scanner input = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		char txt = input.next().charAt(0);
		// 입력받은 문자열 중 첫번째 문자를 잘라서 txt에 저장
		//String words = sc.next();
		System.out.println((int)txt);
		System.out.println("문자출력 : " + txt);
		
		boolean result1, result2;
		result1 = ('A' <= txt) && (txt <= 'Z');
		result2 = (65 <= (int)txt) && ((int)txt <= 85);
		System.out.println("영어 대문자 확인 : " + result1);
		System.out.println("영어 대문자 확인 : " + result2);
		
		input.close();
		
	}
}
