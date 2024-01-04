package org.pumkin.day01.printbasic;

public class Exam_PrintSample {
	public static void main(String[] args) {
//		System.out.println("우리가 지금까지 쓰던 출력 메소드");
//		System.out.print("가이드 메시지로 출력할 때 쓰던 메소드");
//		둘의 차이는? print*ln*이 줄바꿈의 역할을 하기 때문에

//		printf() 메소드
//		System.out.printf(null, args); //두 개의 값 받아야 함

		int num = 31;
		double dNum = 5.12345;
		String words = "소수정예F클래스";

		System.out.printf("정수 출력 : %d\n", num);
		System.out.printf("실수 출력 : %.2f\n", dNum); // 소수점 몇 자리?
		System.out.printf("정수 출력 : %s\n", words);

		// F반 공공데이터 개발자과정 11.13개강 4.25종강 true입니다.
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강 %b입니다", 'F', "공공데이터 개발자", 11.13, 4.25, true);
	}
}
