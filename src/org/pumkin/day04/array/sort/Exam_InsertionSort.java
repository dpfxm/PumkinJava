package org.pumkin.day04.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
//		삽입정렬
//		정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
//		배열의 N번 인덱스 값을 0번에서 n~1번 인덱스까지 비교!
//		N은 1부터 시작
//		오름차순, 작은 수를 찾아야 함

//		{2, 5, 4, 1, 3}
//		1 : 2과 5 비교 -> 변화 없음

//		{2, 5, 4, 1, 3}
//		2-1 : 2과 4 비교 -> 변화 없음
//		2-2 : 5와 4 비교 -> 변화 {2, 4, 5, 1, 3}
//		
//		{2, 4, 5, 1, 3}
//		3-1 : 1과 2 비교 -> 변화 {1, 4, 5, 2, 3}
//		3-2 : 2와 4 비교 -> 변화 {1, 2, 5, 4, 3}
//		3-3 : 4와 5 비교 -> 변화 {1, 2, 4, 5, 3}
//		
//		{1, 2, 4, 5, 3}
//		4-1 : 3과 1 비교 -> 변화없음
//		4-2 : 3과 2 비교 -> 변화없음
//		4-3 : 3과 4 비교 -> 변화 {1, 2, 3, 5, 4}
//		4-4 : 4와 5 비교 -> 변화 {1, 2, 3, 4, 5}

		// 1 번째 동작
//		if (arrs[0] > arrs [1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp; // 변화없음
//		}
//		
//		// 2 번째 동작 {2, 5, 4, 1, 3}
//		if (arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		} // {2, 4, 5, 1, 3}
//		if (arrs[0] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[0];
//			arrs[0] = temp; // 변화없음
//		}
//		
//		// 3 번째 동작 {2, 4, 5, 1, 3}
//		if (arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp; // 변화 없음
//		} // {2, 4, 5, 1, 3}
//		if (arrs[1] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[1];
//			arrs[1] = temp; // 변화없음
//		}
//		if (arrs[0] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[0];
//			arrs[0] = temp; // 변화없음
//		}
		int arrs[] = { 2, 5, 4, 1, 3 };

//		for (int i = 1; i < arrs.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if(arrs[j] > arrs[i]) {
//					int temp = arrs[i];
//					arrs[i] = arrs[j];
//					arrs[j] = temp;
//				}
//			}
//		} for (int i = 0; i < arrs.length; i++) { // 정렬된 배열 출력
//			System.out.printf("%d ", arrs[i]);
//			}
//		
//		// if문) 2 번째 동작 {2, 5, 4, 1, 3}
//		if (arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		} // {2, 4, 5, 1, 3}
//		if (arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp; // 변화없음
//		}

		for (int j = 1; j < arrs.length; j++) {
			for (int i = j; i >= 1; i--) {
				if (arrs[i - 1] > arrs[i]) {
					int temp = arrs[i];
					arrs[i] = arrs[i - 1];
					arrs[i - 1] = temp;
				}
			}
		}
		for (int i = 0; i < arrs.length; i++) { // 정렬된 배열 출력
			System.out.printf("%d ", arrs[i]);
		}
	}
}
