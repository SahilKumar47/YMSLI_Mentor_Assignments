package practice.assingment;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
//		StringBuffer buffer = new StringBuffer("string"); how to reverse a string
//		buffer.reverse();
//		System.out.println(buffer);
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		scanner.close();
		for(int i = 0; i < string.length() - 1; i++) {
			if(!(string.charAt(i) < string.charAt(i + 1))) {
				System.out.println("Not a positive String");
				return;
			}
		}
		System.out.println("Positive String");
	}
}
