package class4;

import java.util.Scanner;

public class Hw4DMV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is your age?");
		double age=scanner.nextDouble();
		
		if (age>=18)
		{
			System.out.println("Be able to issue a driver licence");
		}
		else {
			System.out.println("Offer to get a learners permit first");
		}
	}

		
	
	}


