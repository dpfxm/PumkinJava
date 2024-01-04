package org.pumkin.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class CherryCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int result = a + b;
		return result;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		int result = a - b;
		return result;
	}

	@Override
	public double avg(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = (double) sum / a.length;
		return avg;
	}
}
