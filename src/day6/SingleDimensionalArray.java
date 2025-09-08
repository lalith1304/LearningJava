package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// DECLARING ARRAY : APPROACH 1
		     
		   int V[]= new int[6];
                      
		    V[0]=6;
		    V[1]=8;
		    V[2]=9;
		    V[3]=6;
		    V[4]=8;
		    V[5]=9;
		    
	    
		    
		// DECLARING ARRAY : APPROACH 2
		    int v[]= {6,8,9,6,8,9};
		    
		// FIND LENGTH OF AN ARRAY
		    System.out.println("length of an array1 : "+ V.length);
		    System.out.println("length of an array2 : "+ v.length);
	     
		// READ SINGLE VALUE FROM ARRAY
		    System.out.println(V[2]); // here 2 is the index value from first array
		    
		// READING ALL THE VALUES FROM ARRAY ^by using normal for loop^
		    for(int i=0;i<V.length;i++) {   // i be the value of index
		    	System.out.println(V[i] + "normal for loop");    //if we know value i<value of length - 1
		    	                               // for array1= i<4 ;; for array2= i<5		  
		    	                             // if we don't know the length i<length formula
		    }  
		    
		//  READING ALL THE VALUES FROM ARRAY ^by using enhanced for loop (OR) for each loop ^   
		    for(int L:v ) {
		    	System.out.println(L + "enhanced for loop");
		    }
		    
	}
	
	
	
	

	
}
