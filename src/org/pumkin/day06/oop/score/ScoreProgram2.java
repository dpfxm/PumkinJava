package org.pumkin.day06.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		finish: while (true) {
//			case 1 안에서 선언한 변수(kor, eng, math)는 case 2에서 사용 못하는 지역변수가 되기 때문에
//			case 1, case 2에서 모두 쓰려면 밖에서 선언하여
//			사용해야함. 이것이 전역변수의 개념

			System.out.println("===== 메인메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 > ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("===== 성적입력 =====");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2:
				System.out.println("===== 성적출력 =====");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + (kor + eng + math));
				System.out.println("평균 : " + (kor + eng + math) / (double) 3);
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break finish; // 뒤에 코드가 있을 경우 실행해줌. while문만 나오게 됨
//				return; 	  // 지금은 같은 동작이나 뒤에 코드가 있고 살행해야 할 경우 달라짐
			default:
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}
}
