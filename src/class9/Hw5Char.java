package class9;

public class Hw5Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. Create an array to store char values and then print those in reverse order
		
		
		char[] letter=new char[] {'a','b','c','d','e'};
		for(int i=letter.length-1; i>=0;i--) {  // letter.length=5 and we have 0,1,2,3,4 no index5 so using -1 to minus 
			System.out.print(letter[i]+" ");
		}
		
	}

}
