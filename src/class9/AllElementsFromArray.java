package class9;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how to get all value

		String[] iceCream = { "Vanilla", "Chocolate", "pistashio", "kulfi", "mango" };

		for (int i = 0; i < iceCream.length; i++) { // iceCream=5
			System.out.println(iceCream[i]);
		}

		System.out.println("---------------------------------------------");
		

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		for (int i = 0; i < grades.length; i++) // grades=5

			System.out.print(grades[i]+" ");
	}

}
