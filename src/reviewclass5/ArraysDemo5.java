package reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo5 {

	public static void main(String[] args) {

		// Array + Scanner

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of dresses you want to buy");
		int noOfDresses = scanner.nextInt();   //store the #size of elements, get the no. by the user entering the #of dress
		
		double[] prices = new double[noOfDresses];  // then the number is stored in this line

		for (int i = 0; i < noOfDresses; i++) {    //  and then # of dresses is used in here.
			System.out.println("Please enter the price of dress no."+(i+1));   //i+1  so the number will start with 1
			prices[i]=scanner.nextDouble();      // then how many time that it will ask to enter price based on the # of dresses
		}
		System.out.println(Arrays.toString(prices));  //to print out all prices in a nice format
		
		
		System.out.println("--------------------------------------------------------");
		
		// Example of Using enhanced to find the total $ of all dresses
		double sum=0;
		for(double price:prices) {
			sum+=price;   // or sum=sum+price;
		}
		System.out.println("Total for all the dresses = "+sum);
		
	}

}
