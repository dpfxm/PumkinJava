package org.pumkin.day05.oop;

public class Book {
//	제목과 저자를 나타내는 필드를 가진 Book 클래스를 작성하고
//	생성자를 작서하여 필드를 초기화하여라
	public String title;
	public String author;
	
//	기본 생성자(매개변수 생성자가 아님)
//	오류방지차원) 매개변수 생성자를 만들시에 반드시 기본생성자도 같이 쓰기
	public Book() {
		title = "";
		author = "";
	}
//	매개변수 1개 있는 생성자
	public Book(String title) {
		this.title = title;
	}
//	매개변수 2개 있는 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
