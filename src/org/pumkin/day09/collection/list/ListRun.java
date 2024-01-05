package org.pumkin.day09.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {

	}

	public void listSample() {
		List<String> list = new ArrayList<String>(); // 업캐스팅

		list.add("홍창기");
		list.add("백승현");
		list.add("고우석");
		list.add("백승현");
		list.add("이정용");
		list.add("박해민");

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		list.add(2, "임찬규");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void rListSample() {
		RList<Integer> list = new RList<Integer>();

		list.add(1113);
		list.add(101);
		list.add(5161);

		int num = list.get(2);
		System.out.println("num : " + num);
	}

	public void objectListSample() {
		ObjectList objList = new ObjectList();

//		입력하려면 메소드 add()를 사용
//		컬렉션 중 리스트
		objList.add(11.13);
		objList.add(61);
		objList.add("엘지");
//		출력
		double start = (double) objList.get(0);
		int end = (int) objList.get(1);
		String msg = (String) objList.get(2);
//		일일히 형변환을 해야하는 불편함이 있음

		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}

	public void intListSample() {
		IntList nums = new IntList();

		nums.add(18);
		nums.add(31);
		nums.add(33);

		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));

		System.out.println("크기 : " + nums.size());

		nums.clear();
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size());
	}
}
