package polymorphism;

public class Overloading {
	
	private static final void method(int a, int b) {
		System.out.println(a+""+b);
	}
	
	public void method(int a, float b) {
		System.out.println();
	}
	
	public StringBuffer method(int a, long b) {
		StringBuffer sb= new StringBuffer("Hi");
		return sb;
		//return "Hi";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
