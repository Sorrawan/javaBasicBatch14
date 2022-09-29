package class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// See in an interview
		
		// .indexOf() => Search for first appearance
		String str="I am always confused";      //Remember  it start with 0
		System.out.println(str.indexOf("a"));  //2
		System.out.println(str.indexOf("s"));  //10
		System.out.println(str.indexOf(" "));  //1

		
		//.substring()  => Find the sub String ,  give you smaller String from a String we can start the starting
		//part to this method and it will return us the subString from that index
		System.out.println(str.substring(2));   //am always confused
		System.out.println(str.substring(5));   //always confused
		
		// Can specify the ending part
		System.out.println(str.substring(5,11));  //always
		
		
	}

}
