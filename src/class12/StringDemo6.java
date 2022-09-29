package class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		/*
		 * toCharArray will convert a String to an array of chars
		 */
		
		String str="I love java programming";
		char[] charArray=str.toCharArray();
		System.out.println(charArray[5]);     //Print single letter
		
		System.out.println(Arrays.toString(charArray));   //Print all
		
		
		System.out.println(charArray[7]);    //Print single letter
		
		int counter=0;
		for(char c:charArray) {
			if(c=='a') {
				counter++;
			}
		}
		System.out.println("Letter a has appear "+counter+" times");

	}

}
