package org.pumkin.day13.socket.calculator;

import java.io.*;
import java.net.*;

public class CalcServer {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 8888;

		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다 . .");
			Socket socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다!"); 	// 서버의 소켓이 만들어짐

			is = socket.getInputStream(); 					// socket 객체 내의 스트림을 사용함
			os = socket.getOutputStream(); 					// socket 객체 내의 스트림을 사용함
			dis = new DataInputStream(is);					// 보조스트림 is와 os 설정
			dos = new DataOutputStream(os);

			String recvMsg = dis.readUTF();
			System.out.println(recvMsg);
			//
//			dos.writeUTF("61");
//			dos.flush();
			//
			int answer = 0;
			String [] words = recvMsg.split(" ");
			for (int i = 0; i < words.length; i++) {
				System.out.print(words[i]);
			}
			switch(words[1]) {
			case "+" :
				answer = Integer.parseInt(words[0]) + Integer.parseInt(words[2]);
				break;
			case "-" :
				answer = Integer.parseInt(words[0]) - Integer.parseInt(words[2]);
				break;
			case "*" :
				answer = Integer.parseInt(words[0]) * Integer.parseInt(words[2]);
				break;
			case "/" :
				answer = Integer.parseInt(words[0]) / Integer.parseInt(words[2]);
				break;
			}
			
			dos.writeInt(answer);
			dos.flush();
			
//			int readByteCount;
//			byte[] readBytes = new byte[1024];
//			readByteCount = is.read(readBytes);
//			String result = new String(readBytes, 0, readByteCount);
//			System.out.println(result);
//			result = "61";
			
//			byte[] data = result.getBytes();
//			os.write(data);
//			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
