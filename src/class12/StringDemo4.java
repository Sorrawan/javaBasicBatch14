package class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// จดไม่เสร็จ   ต้องมาฟังใหม่
		
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		if(str.equals("Shah")){
			System.out.println("I found it");
		}
		
		if(str.equals(str3)){
			System.out.println("I found it");
		}
		
		if(str==str3){      // the answer return "False"  เพราะString ใช้ ==  ไม่ได้
			System.out.println("I found it");
		}

	}

}
