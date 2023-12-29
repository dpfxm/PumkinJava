package org.pumkin.day06.oop.score;

import java.util.Scanner;

public class ScoreProgram3 {
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		finish :
		while(true) {
			int choice = std.printMenu();			
			switch(choice) {
			case 1 : std.inputScore(); break;
			case 2 : std.printScore(); break;
			case 3 : std.displayMsg("프로그램이 종료되었습니다."); break finish;
			default : std.displayMsg("1 ~ 3 사이의 숫자를 입력해주세요."); break;
			}
		}
	}
}
