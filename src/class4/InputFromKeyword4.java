package class4;

import java.util.Scanner;

public class InputFromKeyword4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ตัวอย่างที่ เพิ่มLevel 
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		//Take a String type input from the keyboard and stores it in name variable
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		// Take an int from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" You are "+age+"years old");
		
		
		
	}

}
