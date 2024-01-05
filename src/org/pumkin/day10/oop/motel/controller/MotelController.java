package org.pumkin.day10.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import org.pumkin.day10.oop.motel.model.vo.Room;

public class MotelController {
// * VO 없이 할 수도 있음
//	List<Boolean> rooms;
	
//	* With VO
	List<Room> roomList;
	public MotelController() {
//		rooms = new ArrayList<Boolean>();
		roomList = new ArrayList<Room>(10);
		for (int i = 0; i < 10; i++) {
//			rooms.add(false);
			roomList.add(new Room(false));
		}
	}
	public void checkOut(int roomNum) {
//		rooms.set(roomNum - 1,  false);
		roomList.set(roomNum - 1, new Room(false));
	}
	public void checkIn(int roomNum) {
//		rooms.set(roomNum - 1,  true);
		roomList.set(roomNum - 1, new Room(true));
	}

	public List<Room> printAllRooms() {
		return roomList;
	}
}
