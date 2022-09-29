package class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Continue statement
		 //continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions

		
		
		for(int i=1; i<5; i++) {
			if(i==3) {
			continue;   // should be used inside if statement, when the conditon is met, it will skip and go back to
			                     //the beginning of the loop. it won't go to "System.out.println();" as you see no answer "3"
			}
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
		}
		//I want to print number from 1 to 20, except number 3,7,11
		
	for (int i=1; i<=20; i++) {
		if(i==3 || i==7 || i==11) {
			continue;  //when it meet the condition "3,7,11" it will go back to "for(int.......)"w/o print out those number
		}
		System.out.print(i+" ");
	}
		
	}

}
