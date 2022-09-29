package class12;

public class PhoneTester {

	public static void main(String[] args) {
		
		
		/*
		 * if class where object we are creating is present inside the same package
		 * we dont need to import it.
		 */
		
		//Related with HwPhone where it is created about Phone under same Class12 (Package)

		//Try to create another object in another class under Class12
		HwPhone iphone=new HwPhone();
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		//new Phone() => To create the object
		HwPhone samsungPhone=new HwPhone();
		samsungPhone.model="S22 Ultra";
		samsungPhone.make="Samsung";
		samsungPhone.year=2022;
		samsungPhone.makeCall();
		

	}

}
