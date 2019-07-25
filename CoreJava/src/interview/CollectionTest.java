package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CollectionTest ct= new CollectionTest();
//		ct.arrayList();
//		ct.linkedListMethod();
		
		
		
		int a=1;
		byte b=(byte)a;
		System.out.println(b);

	}
	
	
	public void hashSet() {
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0;i<=10;i++) {
			set.add(i);
			
		}
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			it.next();
		}
	}
	
	public void arrayList() {
		List<Integer> al= new ArrayList<Integer>();
		long time=System.currentTimeMillis();
		for(int i=0;i<=100000;i++) {
			al.add(i);
		}
		long timeEnd= System.currentTimeMillis();
		System.out.println(timeEnd-time);
		
		
		long getTime=System.currentTimeMillis();
		for(int i=0;i<=al.size()-1;i++) {
			int j=al.get(i);
		}
		long getEndTime=System.currentTimeMillis();
		
		System.out.println(getEndTime-getTime);
	}
	
	
	public void linkedListMethod() { // LL is slower in getting values from Collection.
		LinkedList<Integer> ll= new LinkedList<Integer>();
		long timeStart=System.currentTimeMillis();
		System.out.println(timeStart);
		for(int i=0;i<=100000;i++) {
			ll.add(i);
		}
		long timeEnd=System.currentTimeMillis();
		long time=timeEnd-timeStart;
		System.out.println(timeEnd);
		System.out.println(time);
		
		
		long getTime=System.currentTimeMillis();
		for(int i=0;i<=ll.size()-1;i++) {
			int j=ll.get(i);
			
		}
		long getEndTime=System.currentTimeMillis();
		System.out.println(getEndTime-getTime);
	}

}
