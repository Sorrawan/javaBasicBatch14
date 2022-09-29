package class11;

public class Student {

	
	//
	//Define the properties
	String name;
	String id;
	int age;
	double weight;
	char gender;

	//Create behavior
	void study() {
		System.out.println("Student is studying");
	}

	void deleteNessages() {
		System.out.println("Deleting message from Discord");
	}

	void eat() {
		System.out.println("Eating pizzaaaaaaaaaaa...");   //logic inside behavior
	}

	public static void main(String[] args) {
		Student frisdoonObject=new Student();  //new Student() = creating the object of student class
		frisdoonObject.name="Friadoon";
		frisdoonObject.id="123";
		frisdoonObject.age=22;
		
		System.out.println(frisdoonObject.name);
		System.out.println(frisdoonObject.age);
		frisdoonObject.deleteNessages();
		
		
		System.out.println("*****************************************");
		
		Student student2=new Student();   //Create another object
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
		
	}
}
