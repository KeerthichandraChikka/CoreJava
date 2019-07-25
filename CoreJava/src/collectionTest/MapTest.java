package collectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	
	public static void main(String[] args) {
		Map<Integer,String>hashMap= new HashMap<Integer, String>();
		hashMap.put(1, "Hello");
		hashMap.put(2, "Hi");
		hashMap.put(3, "HelloHI");
		
		for(Entry<Integer,String> entry:hashMap.entrySet()) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}

}
