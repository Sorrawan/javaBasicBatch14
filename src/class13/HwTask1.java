package class13;

public class HwTask1 {

	
		// TODO Auto-generated method stub

		/*
		 *  Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
		 */
	public static void main(String[] args) {
		
		String str="hello";
		int length=str.length();    //5
		
		if(!str.isEmpty() && length%2!=0 && length>=3) {      // not Empty  && 5/2 !=0 && 5>=3 => All true then PASSED
			int middleIndex=length/2;    // 5/2=2.5 
			System.out.println(str.charAt(middleIndex));
		}
	}

}
