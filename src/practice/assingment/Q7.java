package practice.assingment;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = scanner.nextLine();
		System.out.println(isValid(username));
		scanner.close();
	}
	
	public static boolean isValid(String username) {
		if(username.endsWith("_job") && (username.length() - 4) >= 8) {
			return true;
		}
		return false;
	}
}
