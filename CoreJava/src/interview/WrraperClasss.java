package interview;

public class WrraperClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Wrapper classes are Integer
		 * 					   Byte, Short, Boolean, Long, Float, Double.
		 * 
		 * 
		 */
		
		// How to prove Wrapper class objects are immutable ?
		
		Integer e= new Integer(123);
		Integer d= new Integer(123);
		System.out.println(e==d);
		Integer a= new Integer("234");
		if( a instanceof Integer) {
			System.out.println("true");
		}
		
		String s= new String("2");
		if(s instanceof String) {
			System.out.println("true");
		}
		
		int b= Integer.parseInt(s);
		
		
	//	String s=Integer.toString(a);
		System.out.println(a);
		//int s=a.parseInt(s)
		
		
		
	}

}
