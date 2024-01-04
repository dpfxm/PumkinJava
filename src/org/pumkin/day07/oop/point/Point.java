package org.pumkin.day07.oop.point;

public class Point {
	public int pub;
	int def;
	protected int pro;
	private int pri;

	private int x, y;

//	메소드
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.printf("%d, %d\n", x, y);
	}
}