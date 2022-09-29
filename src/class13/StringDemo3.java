package class13;

public class StringDemo3 {

	
public static void main(String[] args) {
	String str="dkfjewpfd#%$%^$##$T%^%Y^*65544q33";
	
	System.out.println(str.replaceAll("[0-9]","@"));        //Want to remove the number from String
	System.out.println(str.replaceAll("[0-9]",""));         // if don't want to replace with anything
	
	System.out.println(str.replaceAll("[df]","")); 
	
	//Remove all letters from a to z refer the asci table fro range into
	System.out.println(str.replaceAll("[a-z]","")); 
	
	//Remove all letters from A to Z refer the asci table fro range into
	System.out.println(str.replaceAll("[A-Z]",""));     //can look and compare at "ascii table"
	
	System.out.println(str.replaceAll("[0-z]","")); 
	
	
	System.out.println(str.replaceAll("[^A-Z]",""));    //it will replace everything but not A-Z
	
	System.out.println(str.replaceAll("[^a-zA-Z]",""));  // Remove all letters  other than A to Z and a to z refer the asci table for range info
	
	
	/*
     * Remove all letters  other than A to Z and a to z and 0 to 9 refer the asci table for range info 
     */
	System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));  
	
	
	
	
}
}
