package class7;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print all numbers from 1-10
		
		int num=1;
		while (num<=10) {    ////write the condition loops10times
			System.out.print(num+ " ");
			num++;  
		}   
		
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		//print all numbers from 10 to 25
		
		int a=10;
		while(a<=25) {
			
			System.out.print(a+ "  ");
			a++;
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		//print all number from 10 to 1
		
		int b=10;
		while (b>=1) {
			System.out.print(b+ "  ");
			b--;
		}
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		//print all number from 50 to 20
		int t=50;
		while (t>=20 ) {
			System.out.print(t+ "  ");
			t--;
		}
		
		
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		//print all even number from 1 to 20
		int d=2;
		
		while (d<=20) {
			System.out.print(d+ "  ");
			d+= 2;
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		//print all even number from 1 to 20  //Another example
		
		int i=1;
		while(i<=20) {
			if (i%2==0) {
				System.out.print(i + "  ");
			}
			i++;
		}
		
	}

}
