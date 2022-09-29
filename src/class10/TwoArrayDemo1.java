package class10;

public class TwoArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String[][] countries = { { "usa", "canada" }, // 1st array with index 0
				{ "peru", "brazil", "columbia", "ecuador" }, // 2nd array with index1
				{ "ethiopia", "egypt", "kenya" }, { "germany", "turkiye", "moldova", "ukraine" },
				{ "kazakhstan", "afghanistan", "korea" } };

		System.out.println(countries.length); // 5 (total no. of arrays or rows)

		int elof1arr = countries[0].length; // Finding the # of each element
		System.out.println(elof1arr); // # of elements from 1st array

		int elof2arr = countries[1].length; // Finding the # of 2nd element
		System.out.println(elof2arr); // # of elements from 2nd array

		System.out.println("---------Getting all values from 2D array + Using regular Loop-------------");

		for (int r = 0; r < countries.length; r++) { // loops over rows , countries.length=5 elements
			for (int c = 0; c < countries[r].length; c++) { // becuz # of r will be changing r=row , countries= 2
															// elements
				System.out.print(countries[r][c] + " "); //
			}
			System.out.println();
		}
		
		
		System.out.println("---------Getting all values from 2D array+ Using Enhanced For loop/For Each Loop-------------");

		// Using Enhanced For loop can't use for running specify loop you wanna get only
		// that result, must use regular For loop
		for (String[] country : countries) {
			for (String c : country) {
				if (c.equals("kazakhstan")) {
					System.out.println(c + " is my home country");
				} else {
					System.out.print(c + " ");
				}
				System.out.println();
			}
		}
	}
}
