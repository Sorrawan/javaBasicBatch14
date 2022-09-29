package class5;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean understandJava = true;
		boolean enjoyJava = true;
		boolean practice=true;

		// Ex. T&&T&&T
		if (understandJava && enjoyJava && practice) {
			System.out.println("This is awesome");
		}

		
		//Ex.2  &&
		System.out.println(" **********************another example**********************  ");
		int n1=100;
		int n2=200;
		int n3=300;
		
		if(n1>n2 && n1>n3) {    // F&&F = F
		System.out.println(n1+" is the largest");
		
		}else if(n2>n3 && n2>n1) {  // F&&T =F
			System.out.println(n2+" is the largest");
		}else if (n3>n1 && n3>n2) {  // T&&T = T    so the answer will go to this one 
			System.out.println(n3+" is the largest");
		}
		
		}
	}


