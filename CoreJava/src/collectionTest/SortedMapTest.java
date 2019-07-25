package collectionTest;

 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap; 

public class SortedMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer, String> sm = 
                new TreeMap<Integer, String>(); 
    sm.put(new Integer(2), "practice"); 
    sm.put(new Integer(3), "quiz"); 
    sm.put(new Integer(5), "code"); 
    sm.put(new Integer(4), "contribute"); 
    sm.put(new Integer(1), "geeksforgeeks"); 
    System.out.println(sm.firstKey()+" tail map is:"+sm.tailMap(3 ) + "head map is:"+sm.headMap(2));
    
    for(Entry<Integer,String> entry: sm.entrySet()){
    	
    	System.out.println(entry.getValue()+"  "+entry.getKey());
    	
    }
    
    
    Map<Integer,String> hashMap= new HashMap<Integer,String>();
    hashMap.put(null,"Hello");

	}

}
