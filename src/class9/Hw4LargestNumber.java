package class9;

public class Hw4LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//4. From an array of integer elements find the largest number.
		
		int[] num = {2,12,33,4,83 };
		int largest=num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>largest)
				largest=num[i];
			
			}
		System.out.println("Largest: "+largest);
		
		
		System.out.println("---------------------------------------------------------");
		
		//another way   ; each value put inside n then compare
		
		int[] nums= {100,400,3000,10};
		int largestnum=nums[0];
		for(int n:nums) {
			if(n>largestnum) {
				largestnum=n;
			}
		}
		System.out.println(largestnum);
	}

}
