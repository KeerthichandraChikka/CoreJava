package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		
		System.out.println(list);
		
		DuplicatesList dl= new DuplicatesList();
		dl.removeDuplicates(list);
	

	}
	
	
	public void removeDuplicates(List<Integer> list) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.addAll(list);
		list.clear();
		list.addAll(set);
		
		System.out.println(list);
		
		
		
	}

}
