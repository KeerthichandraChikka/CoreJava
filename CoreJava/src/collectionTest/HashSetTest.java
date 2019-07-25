package collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b= new Book(1,"Corejava");
		Book b1= new Book(1,"Struts");
		Book b2= new Book(2,"Adv java");
		Set<Book> hashSet= new HashSet<Book>();
		hashSet.add(b);
		hashSet.add(b1);
		hashSet.add(b2);
		hashSet.add(null);
		
		Iterator<Book> itr=hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	
	}

}
