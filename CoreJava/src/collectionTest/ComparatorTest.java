package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	
	public static void main(String[] args) {
		
		List<Employee> al= new ArrayList<Employee>();
		
		
		al.add(new Employee(123,"Keerthichandra Chikka",25));
		al.add(new Employee(213,"Kumar",32));
		al.add(new Employee(234,"Rakesh",35));//int empId, String empName, int age
		
		Collections.sort(al,new EmpIdComparator());
		
		/*
		 * 
		 *		this technique for before 1.7. 
		*/
		
		System.out.println(al);
		
		
		Comparator<Employee> cm1=Comparator.comparing(Employee::getAge);  
		   Collections.sort(al,cm1);
		   
		   /*
			 * 
			 *	this technique for after 1.8.   No need to wirte separate class which is implementing Comparator interface.
			 *
			*/
		   System.out.println(al);
		
	}
	
	
	
	

}
