package GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayofCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Using Scanner create an array of countries and capitals. When an
array is created for countries and capitals , Then ask the user to store countries and their capitals in those arrays
 then countries and their capitals and print them together.
 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many countries you want to store");
		int size=scanner.nextInt();
		//Two arrays one to store the countries and the other one to store the capitals
		String[] countries=new String[size];
		String[] capitals=new String[size];
		
		scanner.nextLine();   // This is just to consume that extra enter that we will be getting from line no.18
		for(int i=0;i<size;i++) {
			System.out.println("Please Enter the country name");
			countries[i]=scanner.nextLine();   //.nextLine because one country can contain one word
			
			System.out.println("Please Enter the capital name"+countries[i]);
			capitals[i]=scanner.nextLine();   //.nextLine because one country can contain one word
			
		}
		//Print the arrays in a good format
		 System.out.println(Arrays.toString(countries));
	        System.out.println(Arrays.toString(capitals));
	        
	        for(int i=0;i<size;i++) {
	        	System.out.println("The country "+countries[i]+" Has the capital "+capitals[i]);
	        }
		
	}

}
