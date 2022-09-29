package class4;

import java.util.Scanner;

public class Hw7Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program to ask user to enter numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
 * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your worked years?");
		double workYear=scanner.nextDouble();  // Step1
		if(workYear>=5)                       //Step3
		{
			System.out.println("You are eligible for bonus!");
		
			
			System.out.println("How much is your salary?");  //Step4
			double salary=scanner.nextDouble();
			if(salary>50000)
			{
				System.out.println("Congratulations! you will get 5000 for your bonus");
			}
			else
			{
				System.out.println("\"Congratulations! you will get 3000 for your bonus");
			}
		
		
	}else {                                       //Step2
		System.out.println("You are not eligible for bonus!");
	}
	}
		
		
		
	

}
