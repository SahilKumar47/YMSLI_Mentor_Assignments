package practice.assingment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date in DD MM YYYY format");
		int dd = scanner.nextInt();
		int mm = scanner.nextInt();
		int yyyy = scanner.nextInt();

		LocalDate currDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(yyyy, mm, dd);

		Period diff = Period.between(currDate, myDate);
		System.out.println("Difference is " + diff.getYears() + ", years " + diff.getMonths() + " months and "
				+ diff.getDays() + " days");
		scanner.close();
	}
}
