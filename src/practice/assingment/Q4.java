package practice.assingment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Q4 {
	public static void main(String[] args) {
		try {
			File file = new File("q2File.txt");
			if (file.exists()) {
				System.out.println("File exists");
			} else {
				System.out.println("File don't exists");
			}
			if (file.canRead()) {
				System.out.println("File is readable");
			} else {
				System.out.println("File cant be read");
			}
			if (file.canWrite()) {
				System.out.println("File is writable");
			} else {
				System.out.println("File is not writable");
			}
			System.out.println(Files.probeContentType(file.toPath()));
			System.out.println("Length of file in bytes: " + file.length()); // difference between fileinputstream and file class
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
