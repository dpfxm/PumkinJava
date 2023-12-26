package org.pumkin.day03.typetrans;

public class Exam_TypeTrans2 {
	public static void main(String[] args) {
//		형변환
//		컴퓨터에서 연산은 원칙적으로 같은 자료형끼리 계산하여
//		해당 자료형으로 결과가 나옴
//		정수 / 정수 = 정수, 정수 * 정수 = 정수
//		ex) 61 (61.00) / 2 (2.00) = 30 (30.5)
//		강제형변환 / 자동형변환
		
		byte bNum = 127;
		int iNum = 100;
		int iNum2 = 10;
		double dNum = 4.0;
		
//		자동형변환
//		byte -> int, int-> double
		System.out.println(bNum + iNum);
		System.out.println(iNum2/dNum);
//		강제형변환
		System.out.println((byte)(bNum + iNum));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)(2.9) + (int)(1.8));
	}
}
