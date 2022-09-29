package class13;

import java.util.Scanner;

public class HwBabyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
		
		 //เช็คอีกรอบ
		
		String motherName;
		String fatherName;
		boolean isBoy=true;
		String firstHalf;
		String secondHalf;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the name of mother");
		motherName=scanner.next();    //.nextLine(); some people has name more than one word
		
	
		System.out.println("Please enter the name of father");
		fatherName=scanner.next();
		
		System.out.println("Are you expecting a boy or girl  boy=true, Girl=false");
		isBoy=scanner.nextBoolean();
		
		
		if(isBoy) {
			 firstHalf=fatherName.substring(0,fatherName.length()/2);   // 0 is a starting point,end point
			 secondHalf=motherName.substring(motherName.length()/2);    // 
			
		}else {
			 firstHalf=motherName.substring(0,motherName.length()/2);
			 secondHalf=fatherName.substring(fatherName.length()/2);
			 
		}
		System.out.println( firstHalf+secondHalf);
	}

}
