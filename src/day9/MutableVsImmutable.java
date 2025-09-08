package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// Mutable - can change
		 int []L = {9,8,6};
		 System.out.println(Arrays.toString(L));
		 Arrays.sort(L);
		 System.out.println(Arrays.toString(L));
		 
	    // Immutable - cannot change
		 
		 String V = new String("Lucky");
		 System.out.println(V);
		String v= V.concat("Food");
		 System.out.println(V);
		 System.out.println(v);
	}

}
