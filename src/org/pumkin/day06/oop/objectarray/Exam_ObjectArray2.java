package org.pumkin.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
		Book books[] = new Book[2];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < books.length; i++) {			
			System.out.print("제목을 입력해주세요 >> ");
			String title = sc.next();
			System.out.print("저자를 입력해주세요 >> ");
			String author = sc.next();
			
			books[i] = new Book();
			books[i].title = title;
			books[i].author = author;			
		}
		// 객체 배열 출력
		for (int i = 0; i < books.length; i++) {
			System.out.printf("(%s, %s)\n", books[i].title, books[i].author);
		}
	}
}
