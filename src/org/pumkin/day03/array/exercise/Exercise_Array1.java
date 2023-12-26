package org.pumkin.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String[] args) {
		
//		배열의 length 필드를 이용하여 배열 크기만큼 정수를
//		입력받고 평균을 구하는 프로그램을 작성하라.
//		단, 배열의 크기는 5이다.
		
		Scanner sc = new Scanner(System.in);
		int arrs[] = new int[5];
		int sum = 0;
//		입력부분
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.print((i+1) + "번째 양수를 입력해주세요 : ");
			int num = sc.nextInt();
			arrs[i] = num;
			sum += arrs[i];
			} System.out.println("평균은 " + (double)sum/arrs.length + "입니다."); // 형변환
//		출력부분
		
		
//		양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는
//		프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		int maxnum = 0;
//		int nums[];
//		nums = new int[5];
//		
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print((i+1) + "번째 양수를 입력해주세요 : ");
//			int num = sc.nextInt();
//			nums[i] = num;
//			if (nums[i] > maxnum) {
//				maxnum = nums[i];
//			}
//		} System.out.println("제일 큰 수는 " + maxnum + "입니다.");
	}
}