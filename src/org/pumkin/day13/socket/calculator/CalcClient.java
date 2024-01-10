package org.pumkin.day13.socket.calculator;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalcClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;

		Scanner sc = new Scanner(System.in);

		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
//			계산식(빈칸으로 띄어 입력, 예시 19 + 42) >> 19 + 42
//			계산결과 : 61
			Socket socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다!"); 	// 클라이언트의 소켓이 만들어짐
																	// 서로 통신할 준비 완료

			is = socket.getInputStream();
			os = socket.getOutputStream();	 						// 내가 직접 객체 생성해서 쓰는 것이 나닌
																	// 소켓의 출력스트림을 사용함
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			System.out.print("계산식 (빈칸으로 띄어 입력, 예시 19 + 42) >> ");
			String sendMsg = sc.nextLine();
			
			dos.writeUTF(sendMsg);
			dos.flush();
			
//			byte[] data = sendMsg.getBytes(); 					// 입력받은 값 서버로 보내기
//			os.write(data);
//			os.flush();

			//
			
			int recvMsg = dis.readInt();
			System.out.println("계산 결과 : " + recvMsg);
			
//			int readBytecount;
//			data = new byte[1024];
//			readBytecount = is.read(data);
//			String recvMsg = new String(data, 0, readBytecount);
//			System.out.println("계산결과 : " + recvMsg);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}
}
