
package class12;

import java.util.Scanner;

public class Task1WithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String username;
		String password;
		String confirmPassword;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the username");
		username=scanner.next();
		System.out.println("Please Enter the password");
		password=scanner.next();
		System.out.println("Please Enter the password again");
		confirmPassword=scanner.next();
		
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if (password.length()<8) {
			System.out.println("Password is too short");
		}else if (password.contains(username)) {
			System.out.println("Password cannot contain username");
		}else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}
		else {
			System.out.println("Your username and password has benn created");
		}
	}

}
