package interview;

public class PrimeChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean  flag = false;
		int number=11;
		
		for( int i=2;i<=10;i++) {
			if(number % i==0) {
				flag= false;
			}
			else {
				flag= true;
			}
		}
		System.out.println(flag);
		
	}

}
