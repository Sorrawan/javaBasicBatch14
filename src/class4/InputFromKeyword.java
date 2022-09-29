package class4;

import java.util.Scanner;

public class InputFromKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Scanner is a class that helps us take the input from the keyboard
				//it  contains many diff smaller modules called methods that can help
				// us take Strings booleans basically all types of data from the keyboard
		
		//โค๊ดที่พิมได้ แต่พอเว้นวรรค ข้อวคามที่เว้นวรรคจะไม่โชว์
		
		Scanner input=new Scanner(System.in);  // point mouse to "Scanner"> Click "Import Scanner java(utill)"
		// A Message will be displayed to the user on the console to enter his/her name
	System.out.println("Please enter your name");
	// Activates the java program to take the input from the keyboard and store it inside the name variable
		String name=input.next();
		// prints whatever name user enters on the keyboard on the console
		System.out.println("Hello "+name+" don't be confused");
		

		
		
	}

}
