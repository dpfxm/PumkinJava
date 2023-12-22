package org.pumkin.day02.loop;

public class Exam_While {
	public static void main(String [] args) {
//		2. While문
//		초기식;
//		While (조건식) { 실행문; 증가식; }
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int w = 0;
		while (w < 10) {
			System.out.println(w);
			w++;
		}
		
	}
}
