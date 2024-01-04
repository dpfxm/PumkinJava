package org.pumkin.day06.oop.student;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManageStudent mngStd = new ManageStudent();

		finish: while (true) {
			int choice = mngStd.printMenu();
			switch (choice) {
			case 1:
				mngStd.inputScore();
				break;
			case 2:
				mngStd.printScore();
				break;
			case 3:
				mngStd.displayMsg("프로그램이 종료되었습니다.");
				break finish;
			default:
				mngStd.displayMsg("1 ~ 3 사이의 정수를 입력해주세요.");
				break;
			}
		}
	}
}