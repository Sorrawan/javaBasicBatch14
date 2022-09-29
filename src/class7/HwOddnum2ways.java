package class7;

public class HwOddnum2ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //4. Print odd numbers between 20 and 50 (2 ways)
		
		int v=21;
		while (v<=50) {
			System.out.print(v+ " ");
			v+=2;
		}
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		//Print odd numbers between 20 and 50   //Second way
		int odd=21;
		while(odd<=50) {
			if (odd%2==1) {
				System.out.print(odd + "  ");
			}
			odd++;
		}
	}

}
