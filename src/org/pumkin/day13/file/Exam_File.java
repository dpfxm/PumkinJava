package org.pumkin.day13.file;

import java.io.*; // io 패키지에 있는 모든 것을 임포트 하겠다는 의미

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("E:\\Temp\\copyimg.jpg"); // 파일의 이름이나 경로, 부모의 파일명들을 알 수 있음
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.printf("파일 이름 : %s \n파일경로 : %s \n부모폴더 : %s \n"
				, fileName, path, parent);
		System.out.printf("파일이 존재하는가? : %b \n파일이 맞는가? : %b \n폴더가 맞는가? : %b \n"
				, file.exists()
				, file.isFile()
				, file.isDirectory());

		Exam_File exFile = new Exam_File();
		exFile.folderMake();
		exFile.fileMake();
	}

	public void folderMake() {
		File folderMake = new File("src/org/pumkin/day13/file/wednesday");
		if (!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더가 만들어졌습니다!");
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
	}

	public void fileMake() {
		try {
			File fileMake = new File("src/org/pumkin/day13/file/wednesday.txt");
			if (!fileMake.exists()) {
				fileMake.createNewFile();
				System.out.println("파일이 만들어졌습니다!");
			} else {
				System.out.println("이미 파일이 존재합니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}