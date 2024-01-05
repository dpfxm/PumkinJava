package org.pumkin.day09.collection.studentmvc.view;

import java.util.List;
import java.util.Scanner;

import org.pumkin.day09.collection.studentmvc.model.Student;
import org.pumkin.day09.collection.studentmvc.controller.StudentController;

public class StudentView {
	StudentController sController;
	
	public StudentView() {
		sController = new StudentController();
	}
	
	public void startProgram() {

		end: while (true) {
			int choice = this.printMenu();
			switch (choice) {
			case 1:
				this.inputScore();
				break;
			case 2:
				this.printScore();
				break;
			case 3:
				this.displayMsg("\n프로그램이 종료되었습니다.");
				break end;
			default:
				this.displayMsg("\n1 ~ 3 사이의 정수를 입력해주세요.");
				break;
			}
		}
	}

//	메인 메뉴
	public int printMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== 메인 메뉴 =====\n");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료\n");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

//	성적입력
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("\n===== 성적 입력 =====\n");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("첫 번째 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("두 번째 점수 : ");
		int secondScore = sc.nextInt();

		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);

		sController.addStudent(student);
	}

//	성적출력
	public void printScore() {
		List<Student> students 
			= sController.allStudentList();
		System.out.println("\n===== 성적 출력 =====\n");
		for (int i = 0; i < students.size(); i++) {
			System.out.println("=== " + (i + 1) + "번째 학생의 성적 ===");
			System.out.printf("%s 학생의 첫 번째 점수는 %d점, 두 번째 점수는 %d점입니다.\n"
					, students.get(i).getName()
					, students.get(i).getFirstScore()
					, students.get(i).getSecondScore());
		}
	}

//		메시지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
