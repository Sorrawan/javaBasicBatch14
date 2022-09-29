package class5;

import java.util.Scanner;

public class ExerciseDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 1-7 ");
		int day = input.nextInt();

		if (day >= 1 && day <= 5) {
			System.out.println("Weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("Weekend");
		} else {
			System.out.println("Invalid day");
		}

	}

}
