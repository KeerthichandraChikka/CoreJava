package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,2,4,1,2,4,5,3,2,1,2,3,2};
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i: arr) {
			list.add(i);
		}
		System.out.println(list);*/
		
		Set<Integer> set= new HashSet<Integer>();
		
		
		
		for(int i:arr) {
			set.add(i);
		}
		
		System.out.println(set);
		
		/*set.addAll(list);
		System.out.println(set);
		list.clear();
		list.addAll(set);
		System.out.println(list);*/
		

	}

}
