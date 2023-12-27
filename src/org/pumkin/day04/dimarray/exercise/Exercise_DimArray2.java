package org.pumkin.day04.dimarray.exercise;

public class Exercise_DimArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrs [][] = new int [5][5];
		int k = 1;
		
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%d ", arrs[i][j]);
			}
			System.out.println("");
		}
	}
}
