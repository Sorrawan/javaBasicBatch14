package GroupProject;

public class Five2DArraySumEvennOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5. Create a 2D array of integers. Develop a program which will calculate the
		 * sum of even and odd numbers for that array.
		 */
		
		
		//ไม่เสร็จ
		int[][] arr= {
				{10,9,10,20},{25,30,54},{20,30}};
		
		int evenSum=0;
		int oddSum=0;
		
		for(int[] ar:arr) {
			for(int num:ar) {
				if(num%2==0) {
					evenSum+=num;
				}else {
					oddSum+=num;
				}
			}

		System.out.println("Odd Sum "+oddSum);
		System.out.println("Even Sum "+evenSum);
		

		}
}
}

