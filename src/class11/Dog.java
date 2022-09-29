package class11;

public class Dog {

    // State 
	//attributes/ properties/fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	// This are the behaviours of a dog
	void bark( ) {      //void = to define bihavior
		System.out.println("Barking...........");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping........");
	}
	
	public static void main(String[] args) {

		Dog dog1= new Dog();      	//Creating object from the class   //new = help us clear the object of the class
		dog1.bark();                //Calling a behavior on an object
		dog1.sleep();
	}
}
