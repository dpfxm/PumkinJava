package org.pumkin.day09.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {
	public static void main(String[] args) {
//		Collection의 List, Set, Map -> 저장소 역할
//		Set은 집합의 역할, 집합의 특징으로는 : 
//			1. 순서가 없음 -> 즉, 인덱스가 없음
//			2. 중복이 안됨!
		Set<String> strSet = new HashSet<String>();

		strSet.add("이영빈");
		strSet.add("임찬규");
		strSet.add("문보경");
		strSet.add("이영빈");

		Iterator<String> it = strSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
//		strSet.clear();
		System.out.println("크기 : " + strSet.size());
		System.out.println("값의 존재 체크 : " + strSet.isEmpty());
	}
}