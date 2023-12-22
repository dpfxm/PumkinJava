package org.pumkin.day02.loop;

public class Exam_DoWhile {
	public static void main(String [] args) {
//		3. Do ~ While문
//		초기식;
//		do { 실행문; 증감식; } while (조건식);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int w = 0;
		while (w < 10) {
			System.out.println(w);
			w++;
		}
		
		int d = 0;
		do { 
			System.out.println(d); 
			d++; 
		} while (d < 10);
	}
}
