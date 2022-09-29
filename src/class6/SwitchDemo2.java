package class6;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// matching cases must has same data type as a variable
		// no duplicated case in switch

		char choice = 'K'; // '' becuz we use "char"
		String answer;
		switch (choice) { // วงเล็บเปิด  ประตูเปิด

		case 'Y':
			answer = "Yes";
			break;
		case 'N':
			answer = "No";
			break;
		case 'M':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;

		} // วงเล็บปิด ประตูปิด
		System.out.println(answer);
		
		
	}

}
