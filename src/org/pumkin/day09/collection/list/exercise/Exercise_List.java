package org.pumkin.day09.collection.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_List {
	public static void main(String[] args) {
//		이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을
//		출력하여라
//		
//		1. 문자열만 삽입 가능한 ArrayList 컬렉션 생성
//		2. 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
//		ArrayList<String> strList = new ArrayList<String>(); --> 결합도가 조금 느슨해짐
//		3. ArrayList에 들어있는 모든 이름 출력
//		4. 가장 긴 이름 출력

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력해주세요 : ");
			list.add(sc.next());
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		int longIndex = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(longIndex).length() < list.get(i).length()) {
				longIndex = i;
			}
		} System.out.println("가장 긴 이름 : " + list.get(longIndex));

//		String longest = "";
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).length() > longest.length()) {
//				longest = list.get(i);
//			}
//		} System.out.println("가장 긴 이름 : " + longest);

	}
}
