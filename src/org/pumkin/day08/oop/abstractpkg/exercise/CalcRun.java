package org.pumkin.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class CalcRun {
	public static void main(String[] args) {
//		Calculator cal = new Calculator(); -> Cannot instantiate the type Calculator
//		Calculator를 상속 받은 CherryCacl를 이용해서
		Calculator calculator = new CherryCalc();
		CherryCalc calc = new CherryCalc();

//		System.out.println("합 : " + calc.add(a, b));
		System.out.println("합 : " + calc.add(11, 13));
//		System.out.println("차 : " + calc.sub(a, b));
		System.out.println("차 : " + calculator.sub(61, 51));
		int[] a = { 1, 10, 31, 51, 61 };
		System.out.printf("평균 : %.2f\n", calc.avg(a));
	}
}
