package org.pumkin.day10.oop.javaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello Java";
		msg = new String("Hello Java"); // 객체를 만들면 msg라는 참조 변수에서
										// String이라는 클래스가 가지고 있는
										// 많은 메소드들을 사용할 수 있음
		String data1 = new String(" C#");
		String data2 = new String(", C++");
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());

		// 문자열 포함되어있는지 체크
		System.out.println("#이 있는가? : " + data1.contains("#"));

		// 문자열 연결
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);

		// 문자열 공백 제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);

		// 문자열 교체
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : " + data1);

		// 문자열 썰기 1
		String words[] = data1.split(", ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + " / ");
		}

		// 문자열 썰기 2
		data1 = data1.substring(5);
		System.out.println("5부터 시작하여 썰린 문자열 : " + data1);
		data1 = data1.substring(1, 2);
		System.out.println("범위 자르기 : " + data1);

		// 문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자로 자르기 : " + word);
	}
}
