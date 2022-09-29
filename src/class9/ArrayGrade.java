package class9;

public class ArrayGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Create an array of chars and store grades into it: A,B,C,D. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */

		char[] grades= {'A','B','C','D'};
		
		System.out.println(grades[1]);
		
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		//2nd way
		
char[] g=new char[4];
		
		g[0]='A';
		g[1]='B';
		g[2]='C';
		g[3]='D';
		System.out.println(g[1]);
		
	}

}
