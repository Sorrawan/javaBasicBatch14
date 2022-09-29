package class6;

import java.util.Scanner;

public class HwSwitchLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Ask user to enter their country and capture it. Once values are captured print which language user speaks.
 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=in.nextLine();
		String language;
		
		switch(country) {
		case "usa":
			language="English";
			break;
		case "Thailand":
			language="Thai";
			break;
		case "China":
			language="Chinese";
			break;
		case "Korea":
			language="Korean";
			break;
		case "India":
			language="Indian";
			break;
		default:
			language="Unknown";
			break;
		}
		System.out.println("You are from "+country+" and your language is "+language);
		
	}

}
