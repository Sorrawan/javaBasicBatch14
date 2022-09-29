package class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Today is Sunday";
		String str2=new String("Today is Sundat");
		String day=str.substring(9);     //Want only Sunday
		System.out.println(day);
		System.out.println(str.substring(6,8));   //is
		System.out.println(str.substring(14));
		
		System.out.println("******************************");
		
		//
		char c=str.charAt(0);    //Calling the method charAt on str object
		//Getting a specific index, specific character
		System.out.println(str.charAt(4));
		
		
		//
		char[] charArr=str.toCharArray();
		System.out.println(charArr);     //Today is Sunday
		System.out.println(Arrays.toString(charArr));   //[T, o, d, a, y,  , i, s,  , S, u, n, d, a, y]
		
		System.out.println("******************************");
		
		//Find out the index of a
		int index=str.indexOf("a");
		System.out.println(index);
		
	System.out.println(str.indexOf("a",6));   //13      //งง
		
	}

}
