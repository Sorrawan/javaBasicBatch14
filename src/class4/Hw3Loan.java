package class4;

import java.util.Scanner;

public class Hw3Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is the amount of loan is needed.");
		double loan=scanner.nextDouble();
		
		if (loan<=200000)
		{
			System.out.println("Your loan is approved");
		}
		else {
			System.out.println("Your loan is not approved");
		}
	}

}
