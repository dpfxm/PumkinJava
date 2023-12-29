package org.pumkin.day06.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	static int kor = 0;
	static int eng = 0;
	static int math = 0;	//	구조적인 프로그래밍으로 변경하면서 
							//	kor, eng, math 상대적으로 지역변수로 되어버림
							//	main, inputScore 모두 사용할 수 있는 전역변수로 만들어 줌
							//	case 1 안에서 선언한 변수(kor, eng, math)는 case 2에서 사용 못하는 지역변수가 되기 때문에
							//	case 1, case 2에서 모두 쓰려면 밖에서 선언하여
							//	사용해야함. 이것이 전역변수의 개념
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			for(;;) {}
		
		finish : 
			while(true) {
				int choice = printMenu();
				switch(choice) {
				case 1 : 
					inputScore();
					break;
				case 2 : 
					printScore();
					break;
				case 3 : 
					displayMsg("프로그램이 종료되었습니다."); 
					break finish;		// 뒤에 코드가 있을 경우 실행해줌. while문만 나오게 됨
//					return; 			// 지금은 같은 동작이나 뒤에 코드가 있고 살행해야 할 경우 달라짐
				default : 
					displayMsg("1 ~ 3 사이의 숫자를 입력해주세요."); 
					break;
				}
			}
	}
	public static void displayMsg(String Msg) {
		System.out.println(Msg);
	}
	public static void printScore() {
		System.out.println("===== 성적출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.println("평균 : " + (kor + eng + math)/(double)3);
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적입력 =====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static int printMenu() {
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
