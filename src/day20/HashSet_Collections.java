package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Collections {

	public static void main(String[] args) {
		
		// Declaration of hash set
		           HashSet myset=new HashSet(); // Child class storing in same class
		      //   Set Myset=new HashSet(); // child class storing in parent class 
		      //   HashSet <String>MySet=new HashSet<String>(); // Creating set for only one kind of data by using angular brackets<>

	    //adding elements in to hash set 
		           myset.add(678);
		           myset.add(678.9);
		           myset.add("i will eat food next week");
		           myset.add(true);
		           myset.add('S');
		           myset.add(678);
		           myset.add(null);
		           myset.add(null);
		           
		 // Printing the values inside the hash set
		           System.out.println(myset);
		           
		 // Size of an Hash set
		           System.out.println(myset.size());
		           
		           
		 // REmoving the element from the hash set
		           myset.remove(null); // for removing the data we should directly give the data present
		           System.out.println(myset); // removed null from the list
		           
		 // Inserting element in hash set is not possible , because the data storing in hash set will happen randomly
		 //Access specific is not possible because we doesn't have any index value to get element specifically 
		 
		 // But we can do it it by converting the hash set into array list
		           ArrayList al=new ArrayList(myset);
		           System.out.println(al);
		           System.out.println(al.get(3));
		        		 
		 // Reading all the elements in hash set by using for each loop
		           for(Object V:myset) {
		        	  System.out.println(V); 
		           }
		           
		// By using iterator
		           Iterator v=myset.iterator();
		           
		           while(v.hasNext()) {
		        	   System.out.println(v.next());
		           }
		           
		// Clearing all the elements in hash set
		           myset.clear();
		           System.out.println(myset.isEmpty());
		           
}

}
