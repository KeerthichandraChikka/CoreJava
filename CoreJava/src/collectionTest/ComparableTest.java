package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {
	/*
	 * Comparable is an interface 
	 * Comparable Object: it is an object of a class that implements java.lang.Comparable interface
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(new Employee(1, "Keerthichandra", 25));
		treeSet.add(new Employee(2, "Rajashekhar", 26));
		treeSet.add(new Employee(3, "Ramana", 35));
		treeSet.add(new Employee(4, "Ajay", 23));
		
		//Collections.sort(treeSet);
		
		
		System.out.println(treeSet);
		
		
		
			Set<Employee> hashSet = new HashSet<Employee>();
			hashSet.add(new Employee(1, "Keerthichandra", 25));
			hashSet.add(new Employee(2, "Rajashekhar", 26));
			hashSet.add(new Employee(3, "Ramana", 35));
			hashSet.add(new Employee(4, "Ajay", 23));
			
			
			System.out.println(hashSet);
			
			List<Employee> arrayList = new ArrayList<Employee>(hashSet);
			
			
			Collections.sort(arrayList);
			
			
			System.out.println(arrayList);
	}
	
}
