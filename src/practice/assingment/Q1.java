package practice.assingment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integers: ");
		String val = scanner.nextLine();
		StringTokenizer token = new StringTokenizer(val, " ");
		while(token.hasMoreTokens()) {
			String temp = token.nextToken();
			int intVal = Integer.parseInt(temp);
			System.out.println("Integer Val: " + intVal);
			sum += intVal;
		}
		System.out.println("Total Sum: " + sum);
		scanner.close();
	}
}
