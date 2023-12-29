package org.pumkin.day06.oop.score;

import java.util.Scanner;

public class Student {
	public int kor = 0;
	public int eng = 0;
	public int math = 0;
	
	public Student() {}
	
	public void displayMsg(String Msg) {
		System.out.println(Msg);
	}
	public void printScore() {
		System.out.println("===== 성적출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.println("평균 : " + (kor + eng + math)/(double)3);
		
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적입력 =====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
}
