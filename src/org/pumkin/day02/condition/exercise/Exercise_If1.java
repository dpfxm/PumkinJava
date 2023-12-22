package org.pumkin.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String [] args) {
		// 점수와 학년을 입력 받아 60점 이상이면 합격
		// 미만이면 불합격을 출력한다
		// 단, 4학년의 경우 70점 이상이어야 합격을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0 ~ 100) : ");
		int grade = sc.nextInt();
		System.out.print("학년을 입력하세요(1 ~ 4) : ");
		int year = sc.nextInt();
		
		if ((year < 4) && (grade >= 60)) {  // 실행속도 고려
			System.out.println("합격"); 
		} else if ((year == 4) && (grade >= 70)) { 
			System.out.println("합격"); 
		} else { 
			System.out.println("불합격"); }
		
		// if (조건식) { (실행문) }
		// if (조건식) { (실행문1) } else { (실행문2) }
		// if (조건식) { (실행문1) } else if (조건식) { (실행문2) }
		// else { (실행문3) }
		
		sc.close();
	}
}
