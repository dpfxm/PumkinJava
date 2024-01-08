package org.pumkin.day11.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.pumkin.day11.music.model.vo.Music;

public class Exam_SetCollection {
	public static void main(String[] args) {
		Set<Music> musicSet = new HashSet<Music>();
		musicSet.add(new Music("Attention", "뉴진스"));
		musicSet.add(new Music("Drama", "에스파"));
		musicSet.add(new Music("Baddie", "아이브"));
		musicSet.add(new Music("Attention", "뉴진스"));

		Iterator<Music> it = musicSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static void strSetSample() {
		// Collection에는 List, Set, Map
		// Set
		Set<String> strSet = new HashSet<String>();
		strSet.add("춘식이");
		strSet.add("라이언");
		strSet.add("어피치");
		strSet.add("프로도");
		strSet.add("제이지");
		strSet.add("무지");
		strSet.add("튜브");
		strSet.add("네오");
		strSet.add("콘");
		strSet.add("춘식이");

		Iterator<String> it = strSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}