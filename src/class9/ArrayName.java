package class9;

public class ArrayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */

		String[] name= {"Tookta","Travis","Charlie"};
		System.out.println(name[1]);
		
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		String[] names=new String[3];
		
		names[0]="Tookta";
		names[1]="Travis";
		names[2]="Charlie";
		
		System.out.println(names[1]);
		
	}

}
