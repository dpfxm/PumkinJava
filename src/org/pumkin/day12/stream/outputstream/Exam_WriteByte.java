package org.pumkin.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String[] args) {
		OutputStream os = null;

		try {
			os = new FileOutputStream("src/org/pumkin/day12/stream/outputstream/writing2.txt");
			// 같은 경로를 쓰면 덮어쓰기 됨
			byte[] data = "in&out again?".getBytes();
			os.write(data);
			// 한 번에 뭉태기로 밀어넣음
			os.flush();
			System.out.println("파일 쓰기 완료!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
