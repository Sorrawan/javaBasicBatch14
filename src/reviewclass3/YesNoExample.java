package reviewclass3;

import java.util.Scanner;

public class YesNoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//equalsIgnoreCase is for non-primitive only
		/* equalsIgnoreCase = if enter only "y", it still work so don't need to enter "yes"
		 * to get the output
		 * User input may include both capital letters and lowercase letters, and we want our program to accept both
		 */
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("Are you from batch 14");
        String batch14=scanner.next();
        if(batch14.equalsIgnoreCase("yes"))   
        {
            System.out.println("You are amazing");
        }
        else 
        {
            System.out.println("You are good");
        }

}
}