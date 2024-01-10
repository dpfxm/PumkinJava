package org.pumkin.day13.socket.basic;

import java.io.*;
import java.net.*;

public class SocketClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다!");
			// 순차적 실행 : 서버 -> 클라이언트 순으로 실행
			// 서로 소켓 객체가 연결됨
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
