package class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// 
		//".trim()" = Remove the spaces before and after the String but not the ones which are represent in between
		String str=" i love java ";
		System.out.println(str);
		System.out.println(str.trim());  
		
		String str2="Java is very easy";
		/*
		 * .startsWith() = checks if a String starts with a specific letter or word
		 * .endsWith() = check if a string Ends with a specific letter or word
		 * .contains() = check if a string contains with a specific letter or word
		 */
		System.out.println(str2.startsWith("J"));  // To search specific word, need to search  หาตัวต้น
		System.out.println(str2.endsWith("y"));    //หาตัวท้าย
		System.out.println(str2.contains("very"));  // finding specific word
		
		//Method chaining helps us call multiple methods on a single line one method after an other
		System.out.println(str2.toLowerCase().contains("very")); 
		

	}

}
