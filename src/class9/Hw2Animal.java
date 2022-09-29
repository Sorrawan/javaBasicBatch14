package class9;

public class Hw2Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2. Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		String[] animals = { "cat", "dog", "cow", "pig", "ant","bird" };

		for (int i = 0; i < animals.length; i++) { 
			System.out.println(animals[i]);
		}

		System.out.println("---------------------------------------------");
		  
		//Another Way
		
		for(String ani:animals) {
		System.out.println(ani);
		
		}
		
		
	}

}
