package exception;

import java.sql.SQLException;

public class ReturnInTry {
	
	
	public static void main(String[] args) {
		
		//System.out.println(method());
		
		try {
			
			System.out.println("From main try");
			method1();
			method();
			throw new Exception ();
		//	System.out.println("End of main try");
		}
		catch(Exception e) {
			System.out.println("From main catch");
		}
		
	}
	public static String method() {
		
		
		try {
			System.out.println("From try");
			//return "hello";
			//throw new Exception();
			return "Hi";
		}
		catch(Exception e) {
			System.out.println("From catch");
			return "return Catch";
			
		}
		finally {
			System.out.println("finally");
			//return "return finally";
		}
	}
	
	public static void method1() {
		try{
			System.out.println("From child try");
		//	throw new SQLException();
			//System.out.println("From end of child try");
			
		}
		catch(Exception e) {
			System.out.println("From child cath");
		}
	}


}
