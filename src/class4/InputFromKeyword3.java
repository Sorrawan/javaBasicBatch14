package class4;

import java.util.Scanner;

public class InputFromKeyword3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in); // point mouse to "Scanner"> Click "Import Scanner (java.utill)"
		System.out.println("Please enter your age");
		int age=scanner.nextInt();  //we use nextInt() if we want an int type from the keyboard
		
		if (age<18)  {
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
		}
		
		
		
		
		
		
	}

}
