package class5;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Nested IF
		// To format code use : ctrl+shift+f
		
		boolean allergy = true;
		String allergyType = "Wheat";
		if (allergy) {
			System.out.println("What allergyyou have?");

			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoor");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Stay away from peanut");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy product");
			}else {
				System.out.println("We need to do some test");
			}
		} else {
			System.out.println("You are lucky");
		}

	}

}
