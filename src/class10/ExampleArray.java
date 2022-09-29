package class10;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] week= {"Mon","Sun","Tue","Thurs","Fri"};
		
		//if there is Sunday -> it is fun day
		//otherwise-> it is a boring day
		
		for(String day:week) {    //so each elements will be stored inside "day"
			if(day.equals("Sunday")){
				
				System.out.println(day+" is a fun day");
			}else {
				System.out.println(day+" is a boring day");
			}
			
		}

	}

}
