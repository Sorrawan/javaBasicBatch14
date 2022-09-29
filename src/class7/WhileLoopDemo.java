package class7;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//While loop  = infinite loop
		
		int time=10;
		if(time<12) {
			System.out.println("Good morning inside if statement");
		}
		while(time<12) {
			System.out.println("Good morning inside while loop");
			time++;    //14  loop เลยหยุดวน
		}
		
	}

}
