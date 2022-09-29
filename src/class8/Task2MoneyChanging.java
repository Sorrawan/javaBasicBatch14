package class8;

import java.util.Scanner;

public class Task2MoneyChanging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. Whenever user done with payments program should say 
		 * "Thank you for shopping!"
		 */
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("What do you want to buy?");
        String item = scanner.nextLine();

        System.out.println("What is the price of the item");
        double price = scanner.nextDouble();

        double money;
        double total = 0;
        do {
        	System.out.println("How much money do you have?");
        	money=scanner.nextDouble();
        	
        	total+=money;  //accumulate all money 
        	double need;
        	double change;
        	
        	if(total<price) {
        		need=price-total;
        		System.out.println("You need to pay more $ "+need);
        	}else if (total>price) {
        		change=total-price;
        		System.out.println("Here is your change "+change);
        		break;   // so it won't go back to loop and repeat the question again
        	}
        	
        }while(total!=price);
        
		System.out.println("Thank you for shopping!");
	}

}
