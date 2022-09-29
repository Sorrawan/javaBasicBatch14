package reviewclass2;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username="Admin";
		String password="password";
		/*
		 * When we have to check if a box contains a value or not 
		 * we can use == or .equals()
		 * When the data type if primitive we use == like char int short, etc.
		 * when the data types are non-primitive like String we use .equals()
		 * 
		 */
		if(password.equals("password123"))
		{
			System.out.println("Welcome "+username);
		}
		
		else
		{
			System.out.println("Wrong password "+username);
		}
		
		
		
	
		
		
	}

}
