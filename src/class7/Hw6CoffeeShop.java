package class7;

import java.util.Scanner;

public class Hw6CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6. Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
		 * Keep asking to pay for coffee until the user enters the EXACT amount . 
		 * If the user gives more than coffee price --> ask them to give less,
		 *  if the user gives less money then ask to give more. Once user give EXACT amount print “Please enjoy your coffee
		 */
		//งง ไปดูเฉลยอีกรอบ
		
		Scanner scanner=new Scanner(System.in);
		double pay=5;
	    double ans;
		
		do {
			System.out.println("Please pay for your coffee");
			ans=scanner.nextDouble();
			
			 if(ans<pay) {
				 System.out.println("Please give more!");
			 }
			 else if (ans>pay)
			 {
				 System.out.println("Please pay less");
			 }
			 
			}while(pay!=ans);
	
			System.out.println("enjoy your coffee");
	
	}

}
