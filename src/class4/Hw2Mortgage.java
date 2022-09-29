package class4;

import java.util.Scanner;

public class Hw2Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. Once user decides to buy a house, 
		 * 
		 * if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the current mortgage rate?");
		double rate=scanner.nextDouble();  // Step1
		if(rate<4.5)                       //Step3
		{
			System.out.println("user will consider buying a house");
		
			
			System.out.println("How much is the house?");  //Step4
			double house=scanner.nextDouble();
			if(house>200000)
			{
				System.out.println("User will take a loan");
			}
			else
			{
				System.out.println("user will pay cash");
			}
		
		
	}else {                                       //Step2
		System.out.println("User will not buy a house");
	}
	}

}
