package org.pumkin.day11.sort;

public class Exam_Sort {
	// 삽입정렬 작은 값이 맨 앞으로 밀려나가는 느낌
	public void insertionSort() {
		int[] nums = { 23, 11, 13, 24, 4, 25 };
		int temp = 0;

		for (int i = 0; i < nums.length; i++) { 	// 배열의 길이 0부터 끝까지 반복될때
			for (int j = i; j >= 1; j--) { 			// 만약 i = 3이라고 치면, j는 3부터 줄어들면서
				if (nums[j] < nums[j - 1]) {		// nums[3]과 nums[2]를, nums[2]를 nums[1]과 비교
					temp = nums[j - 1];				// 더 작다면 임시적인 정수 temp에 저장해두고
					nums[j - 1] = nums[j];			// 이를 이용해서 배열의 순서를 바꿔줌
					nums[j] = temp;
				}
			}
		}
		printArray(nums);
	}

	// 선택정렬은 왼쪽부터(최솟값을 찾아 그것을 왼쪽에 두는)
	public void selectionSort() {
		int[] nums = { 23, 11, 13, 24, 4, 25 };
		int min = 0;

		for (int i = 0; i < nums.length; i++) {
			min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[min] > nums[j]) {
					min = j;
				}
			} // 첫번째로 제일 작은 값을 찾음
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
			// 그 값은 첫번째 위치와 바꿈
		}
		printArray(nums);
	}

	// 버블정렬은 오른쪽부터
	public void bubbleSort() {
		int[] nums = { 23, 11, 13, 24, 4, 25 };
		int temp = 0;
//		23과 11 비교
//		11과 13 비교
//		13과 24 비교
//		24와 4 비교
//		4와 25 비교
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < (nums.length - 1) - i; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		printArray(nums);
	}

	public void printArray(int[] arrays) {
		for (int i : arrays) {
			System.out.print(i + " ");
		}
	}
}
