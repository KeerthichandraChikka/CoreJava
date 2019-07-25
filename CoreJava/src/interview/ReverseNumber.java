package interview;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=2345;
	//	int num=i;
		int reverse=0;
		while(i!=0) {
			int digit=i%10;
			reverse=reverse*10+digit;
			i=i/10;
			System.out.println(i);
		}
		System.out.println(reverse);
	}

}
