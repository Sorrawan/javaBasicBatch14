package class9;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nested Loop
		
		for(int i=0; i<4; i++){     //outer loop
			   for(int j=0; j<=2; j++){   //inner loop
			       System.out.println("Hello");
			   }                          //inner loop 
			   System.out.println("Bye");
			   break;
			}                           //outer loop
			 
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		for(int s=0; s<4; s++){     //outer loop
			   for(int b=0; b<=2; b++){   //inner loop
			       System.out.println("Hello");
			       break;
			   }                          //inner loop 
			   System.out.println("Bye");
			}                           //outer loop

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		boolean day=true;
		for(int i=1; i<=3; i++){
			while(day) {
				System.out.println("Good Day");
				break;
			}
			System.out.println(i);
		}
	}

}
