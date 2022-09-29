package class7;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Repeat until it get the input you set up
		 * it is used when you don't know how many time do we need to repeat the code
		 */
		Scanner sc=new Scanner(System.in);
		String answer;
		do {
		System.out.println("Did you get a job");
		 answer=sc.nextLine();
		}while(!answer.equals("yes"));
		System.out.println("Congrats");
	}

}
