package class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Create a secret number and let user guess the secret number
		 * once user guessed your secret number--> program says you won
		 */
		
		Scanner sc=new Scanner(System.in);
		int answer;
		int secret=12;
		do {
		System.out.println("Please guess the secret number of 2 digits");
		 answer=sc.nextInt();
		}while(answer!=secret);
		System.out.println("You won");
		
	}

}
