package arrays;

import java.util.Arrays;

/**
 * @author chikka.Keerthichandra
 */


public class MoveZeros {

	public static void main(String[] args) {
		
		int[] array = new int[] {4,5,6,7,8,9};
		
		recursive(array);
		
		


	}
	
	public static void recursive(int [] array) {
		
		if(array.length < 2) {
			return ;
		}
		int midIndex = (array.length)/2;
		
		int[] lefthalf = new int[midIndex];
		
		for(int i=0 ;i<lefthalf.length; i++) {
			lefthalf[i] = array[i];
		}
		
		recursive(lefthalf);
		
		System.out.println(Arrays.toString(lefthalf));
	}

}
