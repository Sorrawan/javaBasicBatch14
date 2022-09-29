package class5;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.next();
		System.out.println("Nice to meet you "+name);
	
		System.out.println("How old are you"+name);
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money do you have? "+name);
		double money=input.nextDouble();
		System.out.println(name+" has "+money);
		
		System.out.println(name+" What is your grade");
		char grade=input.next().charAt(0);   
		System.out.println(name+" has grade "+grade);
		
		System.out.println("Please enter another name");
		name=input.next();
		System.out.println("New name is "+name);
		
	}
	

}
