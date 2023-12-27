package org.pumkin.day04.dimarray;

public class Exam_DimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int nums [] = new int[10];
		int dimNums [][] = new int[2][5]; // 2개 콩콩 찍고 그 안에 다섯개를 만든다
		System.out.println("앞의 크기 : " + dimNums.length);
		System.out.println("뒤의 크기 : " + dimNums[0].length);
		System.out.println("뒤의 크기 : " + dimNums[1].length);
		
		int arrs [][] =  new int[4][4];
		int k = 1;
//		2차원 배열에 값 입력하기
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k++;
			}
		}
//		2차원 배열의 값 출력하기
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.println(arrs[i][j]);
			}
			System.out.println();
		}
	}

}
