package org.pumkin.day11.music.view;

import java.util.List;
import java.util.Scanner;

import org.pumkin.day10.oop.member.model.vo.Member;
import org.pumkin.day11.music.controller.MusicController;
import org.pumkin.day11.music.model.vo.Music;

public class MusicView {
	MusicController musicCtrl;

	public MusicView() {
		musicCtrl = new MusicController();
	}

	public void launchApp() {
		// 메인 메뉴 출력, 여기서 선택하면
		// 선택한 값이 choice로 들어감
		finish: while (true) {
			int choice = this.printMainMenu();
			Music music = null;
			String title = "";
			// choice 값에 따라서 실행문이 다름
			switch (choice) {
			case 1:
				// 가수명, 곡명을 입력 받음
				// music에는 가수명, 곡명이 들어가 있음
				music = this.inputMusic();
				// 마지막 위치에 추가
				// MusicController에게 마지막 위치에 추가하도록 호출함
				// MusicController에 있는 메소드를 호출해야하는데
				// MusicController 객체가 만들어져 있어야 함 --> 그래서 만듦
				musicCtrl.addMusic(music);
				break;
			case 2:
				// 가수명, 곡명을 입력 받음
				music = this.inputMusic();
				// 첫 위치에 추가
				musicCtrl.addFirstMusic(music);
				break;
			case 3:
				// 전체 곡 목록을 가져옴
				// View는 데이터가 없기 때문에 musicController에서 musicList를 가져와여함
				// printAllMusics 메소드 호출 (ctrl 누르고 printAllMusics()를 누르면 해당 코드가 나옴
				List<Music> mList = musicCtrl.printAllMusics();
				// View에 있는 메소드를 이용하여 출력함
				// musicList 가져왔으니 출력
				// View에 있는 printAllMusics() 호출
				// this 붙여서 자기 자신의 메소드임을 나타내지만 이는 생략 가능함!
				this.printAllMusics(mList);
				break;
			case 4:
				// 곡명으로 검색, 곡명을 입력받음
				title = this.inputTitle();
				// musicList는 musicController가 가지고 있기 때문에
				// 곡명만 전달해주고 MusicController의 메소드를 호출하여
				// 곡을 검색함
				music = musicCtrl.printOneMusic(title);
				// 검색은 완료하고 music에 전달함
				// 출력은 view에게 시킴 --> printOneMusic() 메소드 호출 후 찾은 값을 전달한 것!
				this.printOneMusic(music);
				break;
			case 5:
				// 곡명을 입력 받음. View에 있는 inputTitle() 메소드
				title = this.inputTitle();
				// musicList를 가지고 있는 controller에게 삭제 요청
				// deleteMusic() 메소드 호출 (곡명을 전달하면서)
				musicCtrl.deleteMusic(title);
				break;
			case 6:
				// 곡명을 입력받아서 있는지 없는지 출력하고
				// 없으면 없다고 출력
				// 있으면 수정할 정보 입력 받아서 리턴!
				// music에 꽂음
				music = this.modifyMusic();
				// musicList가 있는 컨트롤러에 수정 요청
				// modifyMusic() 호출함 (music을 넘겨주면서)
				if (music != null)
					musicCtrl.modifyMusic(music);
				break;
			case 7:
				// 곡명으로 오름차순 정렬
				this.displayMessage("=== === 곡명 오름차순 정렬 === ===");
				musicCtrl.sortByTitle();
				break;
			case 8:
				// 곡명으로 내림차순 정렬
				this.displayMessage("=== === 곡명 내림차순 정렬 === ===");
				musicCtrl.sortByTitleDESC();
				break;
			case 9:
				break;
			case 10:
				break;
			case 0:
				this.displayMessage("\n프로그램이 종료되었습니다.");
				break finish;
			default:
				this.displayMessage("\n선택지에 있는 정수를 입력해주세요.\n");
				break;
			}
		}
	}

	// 메인 메뉴 출력
	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("\n메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	// 곡명으로 검색
	public String inputTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명을 입력해주세요 >> ");
		String title = sc.nextLine();
		return title;
	}

	// 곡 추가
	public Music inputMusic() {
		Scanner sc = new Scanner(System.in);
		// next(), nextLine()의 차이점
		// next()는 공백 입력받지 않음. 이름, 공백 없는 데이터
		// nextLine()은 공백, 주소 제못 등 띄어쓰기 있는 데이터 모두 받음
		System.out.println("=== === 곡 추가 === ===");
		System.out.print("곡명을 입력해주세요 >> ");
		String title = sc.nextLine();
		System.out.print("가수명을 입력해주세요 >> ");
		String singer = sc.nextLine();

		Music music = new Music(title, singer);

		System.out.println("음악을 저장중입니다 ...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		System.out.println("저장 완료!\n");
		return music;
	}

	// 곡 수정
	public Music modifyMusic() {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== === 곡 추가 === ===");
		System.out.print("곡명을 입력해주세요 >> ");
		String title = sc.nextLine();
		Music music = musicCtrl.inputTitle(title);
		if (music == null) {
			System.out.println("존재하지 않는 정보입니다.\n");
			return null;
		} else {
			System.out.print("\n수정할 곡명을 입력해주세요 >> ");
			music.setTitle(sc.nextLine());
			System.out.print("수정할 가수명을 입력해주세요 >> ");
			music.setSinger(sc.nextLine());
			this.printOneMusic(music);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
			System.out.println("수정 완료!\n");
			return music;
		}
	}

	// 검색 곡 출력
	public void printOneMusic(Music music) {
		System.out.println("곡명 : " + music.getTitle() + ", 가수명 : " + music.getSinger());
	}

	// 전체 곡 목록 출력
	public void printAllMusics(List<Music> mList) {
		System.out.println("=== === 전체 곡 목록 출력 === ===");
		for (Music music : mList) {
			System.out.println("곡명 : " + music.getTitle() + ", 가수명 : " + music.getSinger());
		}
	}

	// 메세지 출력
	public void displayMessage(String msg) {
		System.out.println(msg);
	}
}