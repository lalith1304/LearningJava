package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		// String - Immutable
		   
		   String L="YKCUL";
		   L.concat("food");
		   System.out.println(L);// immutable // cannot change original value 
		   
	    // StringBuffer
		    
		   StringBuffer V = new StringBuffer("Lucky is");
		   V.append(" my food");
		   System.out.println(V);// Mutable // we can change original value
		   
		// StringBuilder
		   
		   StringBuilder v = new StringBuilder("Lucky is always my");
		   v.append(" fav food");
		   System.out.println(v);// Mutable // we can change original value   
		

	}

}
