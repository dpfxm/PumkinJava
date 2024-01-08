package org.pumkin.day11.music.model;

import java.util.Comparator;

import org.pumkin.day11.music.model.vo.Music;

public class DescTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle()) * -1;
	}
}
