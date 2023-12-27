package org.pumkin.day04.array.sort;

import java.util.Arrays;

public class Exam_SortMethod {
	public static void main(String[] args) {
		int arrs[] = {11, 13, 4, 2, 6};
		Arrays.sort(arrs);
//		for (int i = 0; i < arrs.length; i++) {
		for(int i  : arrs) { // arrs에 있는 배열 값이 i에 대입되어서 자동으로 정렬됨 => for-each문 
			System.out.print(i + " ");
		}
	}
}
