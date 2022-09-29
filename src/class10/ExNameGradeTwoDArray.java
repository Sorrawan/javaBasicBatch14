package class10;

public class ExNameGradeTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names
		 * and second array will contain grades. Then your program should print name of
		 * the students that has A and B grade
		 */
		
		//จดไม่เสร็จ

		String[][] arr = {

				{ "Yusuf", "Hamza", "Adam", "John" }, 
				{ "A", "B", "C", "D" } };

		System.out.println(arr[0][0] + "=" + arr[1][0]);
		System.out.println(arr[0][1] + "=" + arr[1][1]);
		System.out.println(arr[0][2] + "=" + arr[1][2]);
		System.out.println(arr[0][3] + "=" + arr[1][3]);

		System.out.println("---------Getting all values from 2D array+ Using regualr For loop-------------");

		// Using regular For loop
		for (int i = 0; i < arr.length; i++) { // arr.length=2
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("---------Getting all values from 2D array+ Using Enhanced For loop-------------");

		// Using Enhanced For loop
		for (String[] singleArray : arr) { // singleArray = new name of variable we want  //loop over 1D or single array
			for (String el : singleArray) { // el == new name of variable we want   //Loop over each element of the 1st array
				System.out.print(el+" ");
			}
			System.out.println();
		}
	}
}
