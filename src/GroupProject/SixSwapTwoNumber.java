package GroupProject;

public class SixSwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6. Write a program to swap 2 numbers without a temporary variable?
		 */
		
		int x= 30; 
		int y= 50;
		
		System.out.println("Before Swap");
		System.out.println("First valuse is "+x );
		System.out.println("Second value is "+y);
		
		System.out.println("---------------------------------------------");
		
		x=x-y;   //  30-50  = -20
		y=x+y;   // (-20)+50=  30
		x=y-x;   // 30-(-20)=  50
		
		System.out.println("After Swap");
		System.out.println("First valuse is "+x );
		System.out.println("Second value is "+y);
	}

}
