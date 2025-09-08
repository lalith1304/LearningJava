package day7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		int []L = {8,6,9};
		
		System.out.println("Before sorting : "+Arrays.toString(L));
		
	    Arrays.sort(L);
	    
	    System.out.println("After sorting : "+Arrays.toString(L));

	}

}
