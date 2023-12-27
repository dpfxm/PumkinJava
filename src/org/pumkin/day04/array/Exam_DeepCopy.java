package org.pumkin.day04.array;

public class Exam_DeepCopy {

	public static void main(String[] args) {
		// 깊은 복사
		int [] origin = {1, 2, 3, 4};
		int [] copy = new int[4]; // 깊은 복사를 하기 위해서는 똑같은 형태와 크기인 배열을 만들고 값을 넣기
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		origin[1] = 11;
		copy[1] = 13;
		System.out.printf("%d\n%d\n", origin[1], copy[1]);

	}

}
