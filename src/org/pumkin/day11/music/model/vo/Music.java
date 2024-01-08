package org.pumkin.day11.music.model.vo;

// Comparable이라는 인터페이스
public class Music implements Comparable<Music> {
	private String title;
	private String singer;

	// 기본 생성자
	public Music() {
	}

	// 매개변수 있는 생성자
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	// title의 getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// singer의 getter, setter
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [제목=" + title + ", 가수명=" + singer + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.singer + this.title).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Music) { 	// 넘겨받은 객체가 Music이 맞는지 확인하고 Music으로 다운캐스팅한 후
			Music music = (Music) obj; 	// 현재[i]의 객체와 다음의 객체[i]의 해시코드를 비교
										// (그렇기 때문에 반복문,비교문과 오버라이딩이 사용되는 것)
			return this.hashCode() == music.hashCode(); // 같으면 true를 출력 --> add할 때, 실행이 되지 않음
														// 다르면 false를 출력
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle()); 	// 0이면 값이 똑같고
													// 0보다 크면 내림차순, 작으면 오름차순
	}
}
