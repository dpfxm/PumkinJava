package org.pumkin.day09.collection.student;

public class StudentRun {
	public static void main(String[] args) {
		StudentController sController = new StudentController();

		end : 
		while (true) {
			int choice = sController.printMenu();
			switch (choice) {
			case 1:
				sController.inputScore();
				break;
			case 2:
				sController.printScore();
				break;
			case 3:
				sController.displayMsg("\n프로그램이 종료되었습니다.");
				break end;
			default:
				sController.displayMsg("\n1 ~ 3 사이의 정수를 입력해주세요.");
				break;
			}
		}
	}
}