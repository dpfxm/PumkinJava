package org.pumkin.day01.basic;

public class Exam_DataType {
	public static void main(String[] args) {
		// 기본형
		// 정수, 실수, 문자, 문자열, 불린형
		// 정수 4가지(byte, short, **int**, long)
		// 실수 2가지(float, **double**)
		// 문자 char
		// 불린형 boolean
		// 참조형
		// 문자열 String
		boolean result = true;
		char lChar = 'g';
		System.out.println(result);
		System.out.println(lChar);

		// 정수 part
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483615253l;

		// 실수 part
		float fNum = 10.051f; // f를 써야 실수가 저장됨
		double dNum = 61.031;

		System.out.println(result);
		System.out.println(lChar);

		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);

		System.out.println(fNum);
		System.out.println(dNum);
	}
}
