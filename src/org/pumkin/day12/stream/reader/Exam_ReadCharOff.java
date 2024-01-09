package org.pumkin.day12.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {
	public static void main(String[] args) {
		Reader reader = null;

		try {
			reader = new FileReader("src/org/pumkin/day12/stream/reader/reading.txt");
			int readCharCount;
			char[] cBuf = new char[3];
			String result = "";
			while ((readCharCount = reader.read(cBuf, 0, 3)) != -1) { // 3개씩 읽음
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.print(result);
//			reader.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
