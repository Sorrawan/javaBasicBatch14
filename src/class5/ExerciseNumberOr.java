package class5;

import java.util.Scanner;

public class ExerciseNumberOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
		 */
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number ");
		int number=input.nextInt();

		if(number>=1 && number<=10) {
			System.out.println("Small");
		}else if (number>=11 && number<=100) {
				System.out.println("Medium");
		}else {
			System.out.println("Large");
		}
		
		
		
	}

}
