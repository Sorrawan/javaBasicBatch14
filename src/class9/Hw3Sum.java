package class9;

public class Hw3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Create an array on integers and calculate the sum of all elements in an array

		int[] arr=new int[4];   
		int sum=0;
		//store elements inside an array 
		arr[0]=12;
		arr[1]=2;
		arr[2]=33;
		arr[3]=84;
		
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum); 
		
		System.out.println("---------------------------------------------------------");
		
		//another way
		
		sum=0;
		for(int number:arr) {
			sum+=number;
		}
		System.out.println(sum);
}
}
