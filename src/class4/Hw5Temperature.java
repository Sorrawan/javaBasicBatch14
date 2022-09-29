package class4;

import java.util.Scanner;

public class Hw5Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create a Java program that will ask user to input city and temperature. 
 * Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ” * 
 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the city");
		String city=scanner.nextLine();
		
		
		System.out.println("Enter the temperature as Fahrenheit");
		float fah=scanner.nextFloat();
		
		float cel=(fah-32)*5/9F;
		
		System.out.println("The temperature is "+cel+" celsius "+"in the "+city);
		
		
		
		
	}

}
