package class6;

import java.util.Scanner;

public class LogicalExBirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =”Spring” if user is born in June, July, August → season =”Summer” etc … At
		 * the end of the program we should see 1 output as “You were born is season
		 * __”.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month = scanner.nextLine();
		String birthMonth;
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			birthMonth = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			birthMonth = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			birthMonth = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			birthMonth = "Fall";
		} else {
			System.out.println("Invalid month");
			birthMonth = "Invalid";
		}
		System.out.println("You were born is " +birthMonth+" season");
	}

}
