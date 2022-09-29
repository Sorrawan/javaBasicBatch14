package class7;

import java.util.Scanner;

public class HwPrompt3times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		// 5. Prompt the user to ask the name 3 times and print "Good afternoon +name...

		Scanner scanner = new Scanner(System.in);   //put scanner outside the Loop becuz we don't need to repeat Scanner 
		String name=null;
		for (int i = 1; i <= 3; i++) {
		System.out.println("What's your name?");
		 name = scanner.nextLine();
		}
			System.out.println("Good afternoon " + name);
		}

	}

