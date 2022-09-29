package class13;

public class HwTask2REverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * // Create a String and print it in reverse order (Sunday → yadnuS).
		 */
		
		String str="Sunday";
		
		for(int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
		
		System.out.println("*************************");
		
		char[] charArr=str.toCharArray();   //.toCharArray()  =change word to be each letter
		for(int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);
		}
	}

}
