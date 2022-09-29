package class6;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the current time in 24hours format ");
		int hour = input.nextInt();

		String timeOfTheDay;

		if (hour >= 1 && hour <= 11) {
			timeOfTheDay = "Morning";

		} else if (hour >= 12 && hour <= 15) {
			timeOfTheDay = "Afternoon";

		} else if (hour >= 16 && hour <= 20) {
			timeOfTheDay = "Evening";

		} else if (hour >= 21 && hour <= 24) {
			timeOfTheDay = "Night";
		} else {
			System.out.println("Wrong number is entered");
			timeOfTheDay = "Invalid";
		}

	}

}
