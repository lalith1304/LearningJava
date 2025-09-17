package day20;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {

	public static void main(String[] args) {
		
		// Declaration 
		      //   HashMap hm=new HashMap();
		           HashMap<Integer,String> hm=new HashMap<Integer,String>();   
		           
		//Add data
		           hm.put(678, "vLVS");
		           hm.put(999, "vLVSK");
		           hm.put(101, "jhon");
		           
		 // Print values
		           System.out.println(hm);
		           
		 // Get values
		           hm.get(678);
		           
		 // Size of map
		           System.out.println(hm.size());
		  
		 // Remove Pair
		           hm.remove(101);
		           
		 // Get all the key values
		          System.out.println(hm.keySet());
		          System.out.println(hm.values());
		          System.out.println(hm.entrySet());
		          
		  // Reading data from hash map 
		          // By using for each loop
		          for(int V:hm.keySet()) {
		        	  System.out.println(V+"    "+hm.get(V));
		          }
		          
		          // Iterator
		          Iterator<Entry<Integer,String>> v=hm.entrySet().iterator();
		          while(v.hasNext()) {
		        	  Entry<Integer,String>entry=v.next();
		        	  System.out.println(entry.getKey()+"    "+entry.getValue());
		          }
		          
		   // clear 
		          hm.clear();
		          System.out.println(hm.isEmpty());
		          
		          

	}

}
