package org.pumkin.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;

		try {
			is = new FileInputStream("src/org/pumkin/day12/stream/inputstream/reading.txt");
			int readByteCount;
			byte[] readBytes = new byte[4];			// n개씩 읽게 함 ( ex. n = 3, jav + a/o + rac +cle/ + jdb + c)
			String result = "";
			while (true) {
				readByteCount = is.read(readBytes); // 바이트 배열과 갯수를 넘겨주면 문자열로
													// 만들어주는 String 생성자
				if (readByteCount == -1)
					break;
				result += new String(readBytes, 0, readByteCount);
				// is.read(readBytes); 				// 강제 예외처리해서 catch문 추가
				System.out.println(result); 		// jav만 출력됨
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
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
}
