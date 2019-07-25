package interview;

public class SwitchCase {
	
	public static String day="Monday";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch(day) {
		case "Sunday":
			System.out.println("It is Sunday");
			break;
			
		case "Monday" :
			System.out.println("It is Monday");
			break;
		
		case "Tuesday":
			System.out.println("It is Tuesday");
			break;
	
		default: 
			System.out.println("NO day");
		}
	}

}
