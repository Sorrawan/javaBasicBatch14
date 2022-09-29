package utils;

public class StringUtils {

	

		public void printAllIndexes(String str,char chartosearch) {
			for(int i=0; i<str.length();i++) {
				if(str.charAt(i)==chartosearch) {      
					System.out.println(i);
				}
			}
		}
		
	}


