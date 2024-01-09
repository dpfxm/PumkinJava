package org.pumkin.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		OutputStream os = null;

		try {
			os = new FileOutputStream("src/org/pumkin/day12/stream/outputstream/writing.txt");
			byte[] data = "Hello, in&output!".getBytes();	// OutputStream이라는걸 통해서 data에 넣어줌 (통로 start)

			for (int i = 0; i < data.length; i++) { 		// Byte를 하나하나 뜯어서
				os.write(data[i]);							// 지정한 경로에 집어넣음 (통로 end)
			}
			os.flush(); // 저장 (Buffer 입출력 공간을 비워줌)
			System.out.println("파일 쓰기 완료!");			// 패키지를 클릭한 후, f5를 눌러서 실행 확인
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
