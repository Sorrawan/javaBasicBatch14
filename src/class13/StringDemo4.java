package class13;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
		

		// See a lot in interview 
		
		// .split(" "); ==> Taking the word out of String  , Split your String
		
		String str="Batch 14 is really good";  
		String [] arr=str.split(" ");  // to pass a specific character so no the spaces will be counted
		System.out.println(Arrays.toString(arr));   //[Batch, 14, is, really, good] 0,1,2,3,4
		System.out.println(arr[4]);   //good
		
		
		String str2="Today is Sunday. Sunday is good. JAva is also good";
		String [] arr2=str2.split("[.]");    // [] to specify regular expression, to pass a specific character
		System.out.println(Arrays.toString(arr2));  //[Today is Sunday,  Sunday is good,  JAva is also good]
	}

}
