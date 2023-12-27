package org.pumkin.day04.array;

public class Exam_HallowCopy {
	public static void main(String[] args) {
		int arrs1[] = new int[4];
		for (int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i * i;
		}
		System.out.println(arrs1[0]);
		System.out.println(arrs1[1]);
		System.out.printf("%d\n%d\n", arrs1[2], arrs1[3]);
		
		int arrs2[] = arrs1;
		arrs1[1] = 10;
		arrs2[1] = 19;
		System.out.println(arrs1[1]); // 얕은 복사 --> 하지말기
	}
}
