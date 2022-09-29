package GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class OneCreateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Using Scanner ask the user about the size of the array create an array of
		 * that size. After the array is created, Fill the array with numbers ask the
		 * numbers from the user through the console with the help of scanner. calculate
		 * the sum of all numbers stored in above step inside the array.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		int size = scanner.nextInt();  // ask the user for the number
		int[] arr = new int[size];    // creates an Array of the above size

		for (int i = 0; i < size; i++) {
			System.out.println("Please Enter an Int number");
			arr[i] = scanner.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum of all numbers from the array = " + sum);
	}

}
