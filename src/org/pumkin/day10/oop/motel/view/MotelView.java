package org.pumkin.day10.oop.motel.view;

import java.util.List;
import java.util.Scanner;

import org.pumkin.day10.oop.motel.controller.MotelController;
import org.pumkin.day10.oop.motel.model.vo.Room;

public class MotelView {
	MotelController mController;

	public MotelView() {
		mController = new MotelController();
	}

	public void launchProgram() {
		finish: for (;;) {
			int input = this.printMainMenu();
			switch (input) {
			case 1:
				this.checkIn();
				break;
			case 2:
				this.checkOut();
				break;
			case 3:
				this.printAllRooms();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break finish;
			default:
				System.out.println("1 ~ 4 사이의 정수를 입력해주세요.");
				break;
			}
		}
	}

	public int printMainMenu() {
//		1. 등록 -> 5. 출력 -> 4. 검색출력 -> 3. 삭제 -> 2. 수정
		Scanner sc = new Scanner(System.in);

		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1.입실   2.퇴실   3.방보기   4.종료");
		System.out.print("선택 > ");
		int input = sc.nextInt();
		return input;
	}

	private void checkRoom() {
		// TODO Auto-generated method stub

	}

	private void checkOut() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 번 방에서 퇴실하시겠습니까?");
		int roomNum = sc.nextInt();
		mController.checkOut(roomNum);
	}

	private void checkIn() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 번 방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();
		mController.checkIn(roomNum);
	}

	public void printAllRooms() {
		int i = 1;
		List<Room> rooms = mController.printAllRooms();
		for (Room r : rooms) {
			if (r.isAvailable()) {
				System.out.println(i + "번째 방은 현재 손님이 있습니다.");
			} else {
				System.out.println(i + "번째 방은 현재 비어 있습니다.");
			}
		}
	}
}
