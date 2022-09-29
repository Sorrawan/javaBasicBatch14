package reviewclass2;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean studyHard=true;

        if (studyHard)
        { //วงเล็บใหญ่เปิด
            System.out.println(" we ge the job in first few weeks");
            boolean goodCommunicationSkills = true;

            if (goodCommunicationSkills)
            {
                System.out.println(" might get a job in Apple Amazon, etc. ");
            } 
            else
            {
                System.out.println(" we need to work on our communication skills");
            }

        }  //วงเล็บใหญ่ปิด
        else 
        {

            System.out.println("it might take a little longer to get the job");
        }
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
