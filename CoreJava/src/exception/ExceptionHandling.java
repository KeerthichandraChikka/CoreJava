package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str="No";
		
		try {
			System.out.println("Start try");
			riskyMethod(str);
			System.out.println("end try");
		}
		catch(Exception e) {
			System.out.println("Catching exception");
		}
		finally{
			System.out.println("from finally");
		}
	}
	
	public static void riskyMethod(String str) throws Exception {
		final int a=10;
		System.out.println("start risky");
		if(str.equals("Yes")){
			throw new Exception();
				
		}
		System.out.println("End risky");
	}

}
