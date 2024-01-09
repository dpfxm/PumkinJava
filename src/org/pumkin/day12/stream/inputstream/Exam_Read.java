package org.pumkin.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null; // 추상클래스이기 때문에 객체 생성 불가함
//		is = new FileInputStream(); // 강제 예외처리 필수

		try {
			is = new FileInputStream("src/org/pumkin/day12/stream/inputstream/reading.txt");
			int readByte; 			// 파일 경로를 넣고, 통로를 만들어서 읽는 것
			readByte = is.read();	// Unhandled exception type IOException -> 예외처리를 해야함(try문)
									// 하지만 이미 try문 안에 들어가 있어서 catch문을 추가 생성
			System.out.println((char) readByte); 	// char로 강제 형변환을 하면 106이 아닌 j가 출력됨
													// 한글자만 읽은 것!
			readByte = is.read();
			System.out.println((char) readByte);
			readByte = is.read();
			System.out.println((char) readByte);
			readByte = is.read();
			System.out.println((char) readByte); // java까지 출력됨. 반복문을 쓴다면?

			do {
				readByte = is.read();
				System.out.println((char) readByte);
			} while (readByte != -1);

//			while (true) {
//				readByte = is.read(); 		// if end of the stream is reached, the next byte is -1
//				if (readByte == -1) 		// 즉, 한 바이트씩 읽어서 출력하는 read();
//					break; 					// -1이 출력되면 break 되도록 함
//				System.out.println((char) readByte);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // import해서 생성, 강제적 예외처리. 반드시 예외처리!
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}