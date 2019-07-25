package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collectionss {
	
	/*
	 * 
	 * The difference of their performance is obvious. 
	 * LinkedList is faster in add and remove, but slower in get. Based on the complexity table and testing results, we can figure out when to use ArrayList or LinkedList. 
	In brief, LinkedList should be preferred if: 
	there are no large number of random access of element
	there are a large number of add/remove operations
	
	*
	*
	* Imp Methods in Collection Interface
	* 
	* add()
	* remove()
	* set()
	* addAll()
	* clear()
	* size()
	* contains()
	* get()
	* toArray
	*/
	
	
	static List<Integer> list =new ArrayList<Integer>(); // implements only List
	
	static List <Integer> linkedList= new LinkedList<Integer>(); // implements List and Queue
	
	
	static Set<Integer> hashSet= new HashSet<Integer>();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		for(int i=1;i<=100000;i++) {
			list.add(i);
			//list.remove(i);
		}
		
		
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("ArrayList add time:"+(endTime-startTime));
		
		
		 startTime=System.currentTimeMillis();
		for(int i=1;i<=100000;i++) {
			linkedList.add(i);
		}
		
		 endTime=System.currentTimeMillis();
		 
		 System.out.println("LinkedList add time:"+(endTime-startTime));
		
		 
		 startTime=System.currentTimeMillis();
		 for(int i=0;i<=list.size()-1;i++) {
			 list.get(i);
			 
		 }
		 
		 endTime=System.currentTimeMillis();
		 
		 System.out.println("ArrayList get time:"+(endTime-startTime));
	
		 
		 startTime=System.currentTimeMillis();
		 for(int i=0;i<=linkedList.size()-1;i++) {
			 linkedList.get(i);
			 
		 }
		 
		 endTime=System.currentTimeMillis();
		 
		 System.out.println("LinkedList get time:"+(endTime-startTime));
	
		list.set(2, 100);
		
		Collections.sort(list);
		
		System.out.println(list);
		//System.out.println(list);
		//System.out.println(list.get(1));
		
		Integer[] listInt= new Integer[list.size()];
		 listInt=list.toArray(listInt);
		
		for(int i=0;i<listInt.length-1;i++) {
		//	System.out.println(listInt[i]);
		}
		
		
		for(int i=0;i<=100;i++) {
			hashSet.add(i);
		}
		
		for(int i=0; i<=hashSet.size()-1;i++) {
			
		}
		//System.out.println(hashSet.);
	}

}
