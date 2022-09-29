package class5;

import java.util.Scanner;

public class HwBirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring” 
if user is born in June, July, August → 
season =”Summer”  etc …
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of your birth month ");
		int month = input.nextInt();

		if (month ==1 || month==2 || month ==12 ) {
			System.out.println("Winter");
		} else if (month >=3  && month <=5) {
			System.out.println("Spring");
		} else if (month >=6 && month <=8) {
			System.out.println("Summer");
		}else if (month >=9 && month <=11) {
			System.out.println("Autumn");
		} else{
			System.out.println("Invalid month");
		}
		
	}

}
