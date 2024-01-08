package org.pumkin.day11.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.pumkin.day11.music.model.DescTitle;
import org.pumkin.day11.music.model.vo.Music;

public class MusicController {
	// 저장소
	List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();
	}

	// 가수명 검색
	public Music inputTitle(String title) {
		for (Music music : mList) {
			if (title.equals(music.getTitle())) {
				return music;
			}
		}
		return null;
	}

	// 곡 추가
	public void inputMusic(Music music) {
		mList.add(music);
	}

	// 마지막 위치에 곡 추가
	public void addMusic(Music music) {
		mList.add(music);
	}

	// 첫 위치에 곡 추가
	public void addFirstMusic(Music music) {
		mList.add(0, music);
	}

	// 특정 곡 검색
	public Music printOneMusic(String title) {
		// for each문 : mList에서 music 하나씩 꺼내석 반복, 없을때까지
		for (Music music : mList) {
			// 입력받은 타이틀과 저장되어있는 타이틀 반복 비교
			if (title.equals(music.getTitle())) {
				return music; // 있으면 리턴 후 종료
			}
		}
		return null; // 없으면 null 리턴
	}

	// 특정 곡 정보 수정
	public void modifyMusic(Music music) {
		int i = 0;
		for (Music mOne : mList) {
			if (music.getTitle().equals(mOne.getTitle())) {
				mList.set(i, music); // 찾아서 수정할 땐 index 필요, set() 메소드 사용
										// set() 메소드는 index 위치에 해당하는 값을 전달해주는 값으로 교체해줌
			} else {
				i++; // 찾았는데 없을 땐 뒤로 넘어가서 비교해야하기 때문에 i값 증가
			}
		}
	}

	// 특정 곡 삭제
	public void deleteMusic(String title) {
		// 선언한 이유 : 삭제할 때 쓰기 위해서
		int i = 0;
		// List에서 찾을 땐 for문과 if문이 있어야 함
		for (Music music : mList) {
			if (title.equals(music.getTitle())) { // 문자열 비교는 equals
				// 삭제할 때는 index를 이용해야하지만 for-each는 i가 없어서
				// 따로 선언하고 찾아서 없을 땐 i를 증가시켜줌
				mList.remove(i);
				break; // 삭제가 완료되면 뒤의 값에서 찾을 필요가 없기 때문에 break로 반복 종료
			} else {
				i++; // 하지만 검색값이 없을 땐 다음 값을 찾기 위해서 수동으로 i값을 증가시킴
			}
		}
	}

	// 전체 곡 목록 출력
	public List<Music> printAllMusics() {
		return mList;
	}

	// 곡명으로 정렬
	public void sortByTitle() {
		// 정렬 대상은 Music의 인스턴스
		for (int i = 0; i < mList.size(); i++) {
			for (int j = 0; j < i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j);
				if (mOne.compareTo(mTwo) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(j, temp);
				}
			}
		}
	}

	public void sortByTitleDESC() {
		// 이렇게 하면 오름차순이지만
		// 내림차순의 경우 클래스가 필요
		Collections.sort(mList, new DescTitle());
	}
}
