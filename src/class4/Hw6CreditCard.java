package class4;

import java.util.Scanner;

public class Hw6CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a credit? Please enter True or False!");
		boolean haveCreditCard = scanner.nextBoolean(); // Step1
		if (haveCreditCard) // Step3
		{
			System.out.println("what is balance on the card?"); // Step4
			double balance = scanner.nextDouble();
			
			if (balance > 1000) {
				System.out.println("Please pay off immediately");
			} else {
				System.out.println("You can spend more");
			}

		} else { // Step2
			System.out.println("Would you like to apply for a credit card?");
		}

	}

}
