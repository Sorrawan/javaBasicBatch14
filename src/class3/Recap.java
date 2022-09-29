package class3;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*
	 * String concatenation helps us combine a string with any primitive data type together
	 * 
	 * 
	 */
		
		String firstName="Mina";
 String lastName="Henen";
 String fullName=firstName+" *** "+lastName;
 System.out.println(fullName);
		
		
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="NewYork";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country; 
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNo+city;
		
		
		String step1="If we subtract 10 from 5 we get = "+10;  
		System.out.println(step1);
		
		System.out.println("If we subtract 10 from 5 we get = "+10); // results in a string 
		// it's is not defined java does not understand what to do when we ask her to subtract
		// a string from a number it complains
		//String step2=step1-5;
		
		
		System.out.println("If we subtract 10 from 5 we get = "+(10-5));
		
		
		
		
		
		
		
	}

}
