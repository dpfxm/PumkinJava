package org.pumkin.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			os = new FileOutputStream("E:\\temp\\img1.jpg");
			byte[] readBytes = new byte[1024 * 10];
			int readByCount;
			while ((readByCount = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByCount);
				os.flush();
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
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
