package interview;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		FibonacciSeries f= new FibonacciSeries();
		f.fib();
	}
	
	
	public void fib() {
		int febCount=15;
		int[] feb= new int [febCount];
		
		feb[0]=0;
		feb[1]=1;
		
		for(int i=2;i<febCount;i++) {
			feb[i]=feb[i-1]+feb[i-2];
		}
		
		for(int x:feb) {
			System.out.println(x);
		}
		
		for(int i=0;i<febCount;i++) {
			System.out.println(feb[i]);
		}
	}

}
