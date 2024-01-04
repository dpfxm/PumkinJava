package org.pumkin.day04.array.sort;

public class Exam_ArraySort {
	public static void main(String[] args) {
//		정렬
//		11 18 2 31 10
//		=> 2 10 11 18 31 (오름차순 정렬)
//		=> 31 18 11 10 2 (내림차순 정렬)
//		머리속으로 했었던 비교에 순서와 방법 정리해놓은 것
//		알고리즘, 문제해결을 하기 위한 절차나 방법

//		종류
//		1. 삽입정렬
//		2. 선택정렬
//		3. 버블정렬
//		4. 퀵정렬
//		5. 병합정렬
//		...

//		int num1 = 51;
//		int num2 = 61;

//		num1에는 61이 들어가고 num2에는 11이 들어가도록 해주세요
//		num1 = num2; // 61
//		num2 = num1; // 61, 51이 사라지게 됨!

//		두 개의 변수를 바꾸는 방법 -> 임시공간 변수를 만들기
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;

//		System.out.printf("num1 : %d\nnum2 : %d", num1, num2);

		int nums[] = { 2, 1, 3 };
//		3, 2, 1이 되도록 바꿔보시오.
//		int temp0 = nums[0];
//		int temp1 = nums[1];
//		nums[0] = nums[2];
//		nums[1] = temp0;
//		nums[2] = temp1;

		int temp1 = nums[0];
		nums[0] = nums[2];
		nums[2] = nums[1];
		nums[1] = temp1;

		System.out.printf("%d, %d, %d", nums[0], nums[1], nums[2]);
	}
}
