package class4;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time=5;
		String day="Monday";
		/*
		 * it is called Outer if condition, if it is true then only 
		 * inner conditions will be checked if it is false nothing from inner if condition will be executed it is like
		 * the main door if main door is closed we can't enter the building
		 */
		
		//it is called Outer if-condition,
		if(day.equals("Monday")) {         
			// As String is a non primitive we can't use "=="so we have to use ".equals" method
			
			//inner if-conditions
			if(time>7) {
				System.out.println("Lets go to the office");
			}
			if (time<6) {
				System.out.println("Lets sleep more");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
