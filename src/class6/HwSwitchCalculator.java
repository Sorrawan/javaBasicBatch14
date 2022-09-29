package class6;

import java.util.Scanner;

public class HwSwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		// If statement

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter one operator");
		char operator = scanner.next().charAt(0);

		System.out.println("Please enter first number");
		double num1 = scanner.nextDouble();

		System.out.println("Please enter second number");
		double num2 = scanner.nextDouble();

		if (operator == '+') {
			System.out.println("The result is " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println("The result is " + (num1 - num2));
		} else if (operator == '*') {
			System.out.println("The result is " + (num1 * num2));
		} else if (operator == '/') {
			System.out.println("The result is " + (num1 / num2));
		} else {
			System.out.println("Invalid operator");
		}

		// switch
		System.out.println("============================================================");

		double result=0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator"); 
			break;
		}
		System.out.println("The result of "+num1+" "+operator+" "+num2+" is "+result);
	}

}
