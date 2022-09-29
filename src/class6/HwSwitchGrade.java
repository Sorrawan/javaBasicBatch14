package class6;

import java.util.Scanner;

public class HwSwitchGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Allow user to enter grade (A, B, or C etc...) and then provide explanation
 * : A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
 * At the end your program should print which grade was entered by a user with explanation.
 */
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade=in.nextLine();
		String exp;
		
		switch(grade) {
		case "A":
			exp="Excellent";
			break;
		case "B":
			exp="Good";
			break;
		case "C":
			exp="Average";
			break;
		case "D":
			exp="Bad";
			break;
		default:
			exp="Not Acceptable";
			break;
		}
		System.out.println("You grade is "+grade+" and it is "+exp);
		
		
		
	}

}
