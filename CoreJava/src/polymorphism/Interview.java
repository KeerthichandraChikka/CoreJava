package polymorphism;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int row=5;
//		for(int y=1;y<=row;y++){
//	        for(int space=row;space>y;space--)
//	            System.out.print(" ");
//	        for(int x=1;x<=y;x++)
//	            System.out.print("*");
//	        System.out.println();
//	    }
		
		
		int x=5;
		x =5&3;
		System.out.println(x);
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j>5) {
					System.out.print("*");
				}
				else {
					//System.out.print(" ");
					//System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j>5) {
					System.out.print("*");
					System.out.print(" ");
				}
				else {
					System.out.print(" ");
					//System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	//	System.out.println(" ");
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>0;j--) {
				if(i+j>4) {
					System.out.print(" ");
				}
				else {
					//System.out.print(" ");
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		//printing diamond
		
		
		int noRows=5;
		int middleRow=(noRows+1)/2;
		int diff=0;
		
		for(int i=1;i<noRows+1;i++) {
			for(int j=1;j<noRows+1;j++) {
				if(((middleRow-diff)<=j) && (j<=middleRow+diff)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
					//System.out.println();
				}
			}
			System.out.println();
			if(i<middleRow) {
				diff++;
			}
			else {
				diff--;
			}
		}

	
	}

}
