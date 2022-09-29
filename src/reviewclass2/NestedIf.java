package reviewclass2;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *Nested IF conditions are condition which are dependent on each other if outer condition not 
		 *true inner-condition is never checked inner-condition is only checked when outer-condition is passed
		 * 
		 */
		
		
		 int money=12;
		 
		 if(money>10) {  //วงเล็บเปิดของ outer conditions  ดังนั้นภายในวงเล็บนี้ ถ้ามีเงื่อนไขมา จะเกี่ยวข้องกับ outer condition
		 System.out.println("Lets but some eggs");
		int noOfEggs=2;
		
		if(noOfEggs>0)   //วงเล็บเปิดของ inter conditions  
		{
			System.out.println("Lets boil some eggs");
		}
		 }
		 }
		
		 }//วงเล็บปิดของ outer conditiond

