package reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * nextLine is a special method that can capture spaces and enters as well when we use any method
		 * like nextInt() or nextBoolean(), nextDouble() and after that if we use nextLine() 
		 * we need to discard that enter by using an extra nextLine call
		 * 
		 */

		Scanner scanner=new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age=scanner.nextInt();   // ข้อมูลตัวเลขมาก่อนข้อมูล String

        System.out.println("Pelease Enter your name");
        scanner.nextLine();   // เพื่อระบบจะได้ให้เราคีย์ข้อมูลชื่อได้   กรณีถ้า ประเภท String ต่อจาก ex. int,double  พวกตัวเลข
        String name=scanner.nextLine();


        System.out.println(name+" is "+age+" years old");


  		
		
	
		
		
	}

}
