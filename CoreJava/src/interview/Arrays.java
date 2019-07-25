package interview;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays arrs= new Arrays();
		arrs.oneD_Array();
		arrs.twoD_Array();

	}
	
	
	public void oneD_Array() {
		 int [] arr;
				arr= new int [10];
		 arr[0]=1;
		
		 System.out.println(arr[0]);
		
	}
	
	public void twoD_Array() {
		int array2d [][]= {
							{2,3,4},
							{1,4,5},
							{2,3,4}
				
				};
		
		System.out.println(array2d.length);
		
		for(int i=0;i<array2d.length;i++) {
			for(int j=0;j<array2d[i].length;j++) {
				
				System.out.print(array2d[i][j]);
				
			}
			System.out.println();
		}
		
		
		int max=array2d[0][0];
		
		for(int i=0;i<array2d.length;i++) {
			for(int j=0;j<array2d[i].length;j++) {
				if(max<array2d[i][j]) {
					
					max=array2d[i][j];
					
				}
			}
		}
		
		System.out.println("Max is:"+max);
		
		
	}

}
