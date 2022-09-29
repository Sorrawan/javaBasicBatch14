package class9;

public class ArrayFixedSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums=new int[3];
		
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[0]);
		

		String[] colors=new String[3];  //can't add elements more than 3
		
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[3]="Yellow";   //<--ArrayIndexOutOfBoundsException when big container is 3 but index>3
		
		System.out.println(colors[3]);
		
	}

}
