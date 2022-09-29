package reviewclass5;

public class Array2DDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] individualsInRoom1= new String[] {"Sebej","shah","mina"};
		String[] individualsInRoom2= new String[] {"Roman","mina"};
		String[] individualsInRoom3= new String[] {"Asad","Priyasri","Ali"};
		
		//an 2D array that will store 3 single d array
		String [][] rooms=new String[3][]; // <= This block can leave it empty, 
		rooms[0]=individualsInRoom1;
		rooms[1]=individualsInRoom2;
		rooms[2]=individualsInRoom3;
		
		System.out.println(rooms[2][2]);
		
		
		
	}

}
