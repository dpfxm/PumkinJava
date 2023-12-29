package org.pumkin.day05.oop.run;

import java.util.Scanner;

import org.pumkin.day05.oop.Book;
import org.pumkin.day05.oop.Circle;
import org.pumkin.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String[] args) {
		
//		Book book = new Book();
//		book.title = "콩쥐팥쥐";
		
		Book book1 = new Book("콩쥐팥쥐");
		System.out.printf("%s : %s\n", book1.title, "작자미상");
		
//		book.title = "Harry Potter";
//		book.author = "J. K. Rowling";
		Book book2 = new Book("Harry Potter", "J. K. Rowling"); // 매개변수를 이용하면 코드가 줄어들으니까
		System.out.printf("%s : %s\n", book2.title, book2.author);
		
//		Scanner sc = new Scanner(System.in);
//		Rectangle square = new Rectangle();
//		System.out.print("너비 입력 : ");
//		square.width = sc.nextInt();
//		System.out.print("높이 입력 : ");
//		square.height = sc.nextInt();
//		double area = square.getArea();
//		System.out.println("사각형의 넓이는 " + area + "입니다.");
		
//		Circle pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "도미노 피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은" + area);
	}
}
