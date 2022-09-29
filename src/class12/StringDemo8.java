package class12;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Replacement
		String str="Batch 14 is good"; 
		System.out.println(str.replace("good","Excellent"));   //Batch 14 is Excellent
		
		//but if we recall "str", the result won't be changed.
		System.out.println(str);   //Batch 14 is good
		
		String str2="Batch 14 is good 9584309%#%#*# KDJSLKDJVKLNDC kjdfdnklf";
		System.out.println(str2.replace("good","Excellent"));   //Batch 14 is Excellent 9584309%#%#*# KDJSLKDJVKLNDC kjdfdnklf
		
		//Replace All
		String str3="Batch 14 is good 9584309%#%#*# KDJSLKDJVKLNDC kjdfdnklf";
		System.out.println(str3.replace("good","Excellent"));
		System.out.println(str3.replaceAll("[a-z]","#"));  //Then all lower case will be gone then replace with #
		

	}

}
