package class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "saturday";
		if (day.equals("saturday") || day.equals("sunday")) { // String is Saturday so T || F = T so the result will
																// show up
			System.out.println("I have JAva class at Syntax");
		}

		System.out.println(" **********************another example**********************  ");
		double money = 120000;
		String title = "Manual Tester";
		if (title.equals("Automation Tester") || money == 120000) {  // F || T = T so the result still show up
			System.out.println("Happy");
		}

		
		
	}

}
