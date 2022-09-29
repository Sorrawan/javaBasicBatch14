package class4;

import java.util.Scanner;

public class InputFromKeyword5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);  // point mouse to "Scanner"> Click "Import 'Scanner'(java.util)"
		System.out.println("Did you solve any Repil Assignments");
		boolean solvedAnyRepils=scanner.nextBoolean();
		
		if (solvedAnyRepils)
		{
			System.out.println("How many Repils you solved");
			int noOfRepilsSolved=scanner.nextInt();
			
			
			if(noOfRepilsSolved>=17)
			{
				System.out.println("You are doing great");
			}else if (noOfRepilsSolved>10)
			{
				System.out.println("You are doing ok, Please solved them as soon as possible");
			
			}else
			{				
				System.out.println("You should solve some more Replis");
			}
	
		}
		else
		{
			System.out.println("They are very important to learn java please solve them");
		}
		
		
	}

}
