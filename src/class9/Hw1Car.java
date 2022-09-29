package class9;

public class Hw1Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		
		String[] cars = { "Tesla", "BMW", "Benz", "Kia", "Hyundai","Toyota" };

		for (int i = 0; i < cars.length; i++) { 
			System.out.println(cars[i]);
		}

		System.out.println("---------------------------------------------");
		  
		//Another Way
		
		for(String carBrand:cars) {
		System.out.println(carBrand);
		
		}
	}

}
