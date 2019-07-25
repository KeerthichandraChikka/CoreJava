package interview;

public class TrickyStatic {
	
	static int i=1;
	static int x=10;
	int y=20;
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int i=1;
		
		for(TrickyStatic.i=1;TrickyStatic.i<=10;TrickyStatic.i++) {
			
			System.out.println(TrickyStatic.i=i+2);
			
		}*/
		TrickyStatic test= null;
		
		
		System.out.println(TrickyStatic.x);
		
		System.out.println();
		System.out.println(test.y);
		
		

	}

}
