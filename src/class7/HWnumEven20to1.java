package class7;

public class HWnumEven20to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. print all even number from 20 to 1
				int d=20;
				
				while (d>=2) {
					System.out.print(d+ "  ");
					d-= 2;
				}
				
				System.out.println("----------------------------------------------");
				System.out.println("----------------------------------------------");
				
				//print all even number from 20 to 1 //Second way
				
				int i=20;
				while(i>=1) {
					if (i%2==0) {
						System.out.print(i + "  ");
					}
					i--;
				}
				
				System.out.println("----------------------------------------------");
				System.out.println("----------------------------------------------");
				
				//Third way
				for(int k=20; k>=1; k-=2) {
						System.out.print(k+" ");
				}
				
				System.out.println("----------------------------------------------");
				System.out.println("----------------------------------------------");
				
				
				
	}

}
