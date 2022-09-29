package class12;

public class StringDemo {

	public static void main(String[] args) {
		
		//length = counts # of characters in a string including the spaces

		String str=new String("Java ");  //Proper way of creating an object
		
		//Simpler and shorter way provided by Java Creators to make our life a little easier
		String name="Asma Alfadhli The Great";     //Only work for String and Wrapper classes  
		System.out.println(str.length());   //5 came from JAVA  so if we put space it will count as well,
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("NAme can't be more than 15 charcaters");
		}
	}

}
