package class9;

public class ArrayDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */


		String[] days= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(days[1]+" "+days[4]+" "+days[0]+" "+days[3]+" "+days[2]);
		
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		
		String[] day=new String[5];
		day[0]="Java";
		day[1]="Saturday";
		day[2]="day";
		day[3]="coding";
		day[4]="is";

		System.out.println(day[1]+" "+day[4]+" "+day[0]+" "+day[3]+" "+day[2]);

	}

}
