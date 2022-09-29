package class9;

public class ClockAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int h1=0; h1<=2; h1++) {    //1
			for(int h2=0; h2<=9; h2++) {   //2
				if(h1==2 && h2==4) {   //3
					break;
				}                      //3
				for(int m1=0; m1<=5;m1++) {   //4
					for(int m2=0; m2<=9; m2++) {   //5
						System.out.println(h1+""+h2+":"+m1+""+m2);
					}                              //5
				}                             //4
			}     //2
		}                                 //1
		
	}

}
