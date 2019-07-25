package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RepetetiveCharacter {
	
	/*for (Map.Entry<K, V> entry : map.entrySet()) 
	{
		K key = (Integer)entry.getKey();
		V value = entry.getValue();

		System.out.println(key + "=" + value);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> hashMap= new HashMap<Character,Integer>();
		String name="Keerthichandra";
		for(int i=0;i<=name.length()-1;i++) {
			char c=name.charAt(i);
			
			if(hashMap.containsKey(c)) {
				int count=hashMap.get(c);
				hashMap.put(c, ++count);
			}
			else {
				hashMap.put(c, 1);
				
			}
		}
		
		System.out.println(hashMap);
		//char key="";
		hashMap.clear();
		System.out.println("hashMap is "+hashMap);
		
		hashMap.put('a', 50);
		hashMap.put('b', 50);
		hashMap.put('c', 60);
		hashMap.put('d', 50);
		hashMap.put('e', 50);
		
		for(Entry<Character,Integer> entry:hashMap.entrySet()) {
			
			char key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key +"is apperead for "+value+" times");
		}
		
		
		List<Entry<Character,Integer>> sortingList=new ArrayList<Entry<Character,Integer>>(hashMap.entrySet());
		
		Collections.sort(sortingList, new Comparator<Entry<Character,Integer>>(){

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();
			}
			
		});
		
		System.out.println(sortingList);
		
	}

}
