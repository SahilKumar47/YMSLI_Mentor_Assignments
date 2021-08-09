package practice.assingment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("q2File.txt"));) {
			int num = 0;
			String lineString;
			while((lineString = reader.readLine()) != null) {
				System.out.print(++num + ": ");
				System.out.println(lineString);
			}
		} catch (IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		
	}
}
