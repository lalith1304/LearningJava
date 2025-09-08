package day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		 Object a[]= {100,10.5,'A',"WELCOME",true};// declaring data in object
		 
		 // READING THE DATA BY USING ENHANCED
		  for(Object x:a) {
			  System.out.println(x + " enhanced");
		  }
		  
		 // READING THE DATA BY USING REGULAR FOR LOOP
		   
		   for(int i=0;i<a.length;i++) {
			   System.out.println(a[i]+" normal");
		   }
		 

	}

}
