package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Collections {

	public static void main(String[] args) {
		
		//Declaration (we can store Heterogeneous data)
		             ArrayList mylist=new ArrayList(); // By using same child class
		         //  List Mylist=new ArrayList(); // This is by storing child class in parent class
		
		//Declaration if you want to store same kind of data
 		           // ArrayList <String>list=new ArrayList<String>(); // By representing the data type inside <data type> we can store same type of data		 
                   // ArrayList <Employee>List=new ArrayList<Employee>(); // we can write employee inside <> if we have mentioned that kind of data in other class
		  
		  // Adding Data into ArrayList
		              mylist.add(678);
		              mylist.add(678.5);
		              mylist.add("please i want to eat");
		              mylist.add('V');
		              mylist.add(true);
		              mylist.add(678);
		              mylist.add(null);
		              mylist.add(null);
		      
		  //Size of array list
		              System.out.println("Size of an array list : " +mylist.size()); // 8
		  
		  //Printing array list
		              System.out.println("Printing data from arralist : " + mylist); //  [678, 678.5, please i want to eat, V, true, 678, null, null]
		  
		  //Remove element from array list
		              mylist.remove(6); // index is 6
		              System.out.println("removed : " + mylist); // [678, 678.5, please i want to eat, V, true, 678, null]
          
		  // Insert element in the array list
		              mylist.add(6, 'S');
		              System.out.println("Inserted element : " + mylist);
		  
		  // Modify element in array list(modify/replace/change)
		             mylist.set(7, "Some more food");
		              System.out.println("Replaced element : " + mylist);
		  
		  //Access specific element from array list
		              System.out.println(mylist.get(3));
		  
		  // Reading all the elements from array list
		    // first by using normal for loop
		              
		             for(int i=0; i<mylist.size();i++) {
		            	 System.out.println(mylist.get(i));
		             }
		             
		    // Second by using for each loop
		             
		             for(Object V:mylist) {
		            	 System.out.println(V);
		             }
		  
		    // Third by using iterator
		             
		             Iterator it=mylist.iterator(); // here we are calling iterator method by my list and we are storing the data of iterator in iterator variable
		             
		             while(it.hasNext()) {
		            	 System.out.println(it.next());
		             }
 		  
		    // Checking array list is empty or not
		             
		           System.out.println("Is array list empty or not : " + mylist.isEmpty());
		  
		   // Remove multiple elements in the array list
		           
		           ArrayList mylist2=new ArrayList();
		           mylist2.add(678.5);
		           mylist2.add(false);
		           
		           mylist.removeAll(mylist2);
		           System.out.println("Removing multiple elements : "+mylist);
		           
		   // Remove all the elements or clearing all the elements 
		           
		           mylist.clear();
		           System.out.println(mylist.isEmpty());
		           
		           
		           
		           
		           
		           
		           
		  
	}

}
