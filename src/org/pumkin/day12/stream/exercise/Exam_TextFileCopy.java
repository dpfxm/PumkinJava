package org.pumkin.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		String src = "C:\\windows\\system.ini";
		String dest = "E:\\temp\\system.txt";

		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			char[] cBuf = new char[1024];
			int readCharCounts;
			while ((readCharCounts = reader.read(cBuf)) != -1) {
				writer.write(cBuf, 0, readCharCounts);
				writer.flush(); // while문 밖으로 둬도 상관 없기는 함 (누적 가능!)
			}
			System.out.println("복사가 완료되었습니다!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					reader.close();
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
