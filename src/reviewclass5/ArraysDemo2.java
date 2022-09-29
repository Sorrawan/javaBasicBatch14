package reviewclass5;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] dresses=new String [] {"Pink Dress","Cocktail","Summer dress","Night Dress","Pencil Dress"};
		//last index is always size-1 because arrays index start from zero
		System.out.println(dresses.length);    // ".length" => show the total of elements
		
		for (int i=0; i<dresses.length;i++) {
		System.out.println("Lets try "+dresses[i]);
		}
		
		
		//Enhanced for loop
		for(String dress:dresses){
		System.out.println(dress);
		}
		
		System.out.println("--------------------------------------------");
		
		//Print all the elements of an array without a loop   //Not often used 
		System.out.println(Arrays.toString(dresses));
	}

}
