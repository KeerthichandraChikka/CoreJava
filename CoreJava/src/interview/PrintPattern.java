package interview;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPattern pattern= new PrintPattern();
	/*	pattern.downPyramid();
		pattern.upPyramid();*/
		pattern.printTriangle();
		
//		pattern.printDia();
	}
	
	public void downPyramid() {
		
		for(int i=0;i<=4;i++) {
			System.out.println("     ***********".substring(i,6+(2*i)));
		}
	}
	
	public void upPyramid() {
		System.out.println("UpPyramid");
		for(int i=5;i>=1;i--) {
			System.out.println("     *********".substring(i,5+(2*i)-3));
		}
	}
	
	
	public void printDia() {
		int counter=1;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i+j>=4) {
				System.out.print("* ");
				//System.out.print();
				counter++;
				}
			else {
				System.out.print(" ");
			}
			
			}
			System.out.println();
		}
	}
	
	public void printTriangle() {
	
	for(int i=0;i<=4;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
		}
	
	System.out.println("============");
	System.out.println();
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if((i+j)>6) {
				System.out.print("");
			}
			else {
				System.out.print("");
				System.out.print("*");
				
			}
		}
		System.out.println(" ");
		System.out.println("Stashes");
		System.out.println("stashes111");
		System.out.println("Stashes222");
		
	}
	
	System.out.println("========");
	System.out.println();
	
	
	for(int i=0;i<=3;i++) {
		for(int j=3;j>=0;j--) {
			if((i+j)>3) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
	System.out.println("=======");
	System.out.println();
	
	
	for( int i=0;i<=3;i++) {
		for(int j=0;j<=3;j++) {
			if((i+j)<3) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	}

}
