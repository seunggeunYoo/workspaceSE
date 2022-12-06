package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 현재파일경로[기준경로]
		 * 		Eclipse->C:\2022-11-JAVA-DEVELOPER\workspaceSE\20.입출력[IO]
		 * 
		 * 상대경로(relative)경로
		 * 		현재경로를 기준으로 경로를 기술
		 * 	*sample/a.txt
		 *  .\sample\.atxt
		 * 절대경로(absolute)경로
		 * 		C:,D:드라이브를 기준으로 경로기술
		 * 
		 */
		System.out.println(File.separatorChar);
		File file1 = new File("데미안.txt");

	}

}
