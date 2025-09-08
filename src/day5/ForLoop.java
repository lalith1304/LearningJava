package day5;

public class ForLoop {

	public static void main(String[] args) {
		// EXAMPLE 1 : PRINT NUMBERS FROM 1 TO 9
		    for(int V=1;V<=9;V++) {
		    	System.out.println(V);
		    }
		    
       // EXAMPLE 2 : PRINT EVEN NUMBERS FROM 2 TO 9
		    for(int v=2;v<=9;v++) {
		    	if(v%2==0) {
		    		System.out.println(v+ " even");
		    	}
		    }
		    
	   // EXAMPLE 3 : PRINT EVEN AND ODD NUMBERS WITH TYPE
		    for(int S=3;S<=9;S++) {
		    	if (S%2==0) {
		    		System.out.println(S +" even");
		    	}
		    	else {
		    		System.out.println(S +" odd");
		    	}
		    }
		    
	   // EXAMPLE 4 : PRINT NUMBERS FROM 4 TO 9
		    for(int L=4;L<=9;L++) {
		    	System.out.println(L);
		    }
	}

}
