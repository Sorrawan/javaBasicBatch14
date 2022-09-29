package GroupProject;

public class Four2DArrayOddnEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] arr= {
				{10,9,20},{25,30,54},{20,30}};
		
		int sum=0;
		
		for(int[] ar:arr) {
			for(int num:ar) {
				if(num%2==0)
					System.out.println(num);
			}
		}
		System.out.println(sum);
		
		
	}

}
