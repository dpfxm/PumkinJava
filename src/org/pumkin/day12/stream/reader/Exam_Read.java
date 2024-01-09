package org.pumkin.day12.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
//		문자 기반 스트림, Reader(입력 스트림)
		Reader reader = null;

		try {
			reader = new FileReader("src/org/pumkin/day12/stream/reader/reading.txt");
			int readData;
			while ((readData = reader.read()) != -1) {
//				int readData = reader.read();
				if (readData == -1)
					break;
				System.out.print((char) readData);
			}
//			reader.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 하지 않든 반드시 실행되어야 하는 코드
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
