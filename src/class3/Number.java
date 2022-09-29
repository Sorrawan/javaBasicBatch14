package class3;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// Positive or Negative
		int number= 2;
		if (number>0) {System.out.println("positive");}
		else {
		if (number<0) {System.out.println("Negative");}
		else 
		{System.out.println("Number is neither positive nor negative");}
		
		
		System.out.println("--------------------------");
		
		 
		// Even or Odd
		
		Scanner bb= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= bb.nextInt();
		
		if (num % 2 == 0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");}
		
	}
}

