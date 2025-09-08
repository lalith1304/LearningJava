package day5;

public class WhileLoop {

	public static void main(String[] args) {
		//EXAMPLE 1 : PRINT 1 TO 6
		
		 int i=1; //Initialization
		 while (i<=6) {     //condition
			 System.out.println(i); //statement
 			 i++;  //increment , i=2 
		 }
		
		 // EXAMPLE 2 : PRINT HELLO MESSAGE 8 TIMES
		  
		  int V=1;
		  while(V<=8) {
			  System.out.println("HELLO");
			  V++;
		  }
		  
		  // EXAMPLE : 3 PRINT ODD NUMBER IN BETWEEN 1 TO 10
		  
		  int v=1;
		  while (v<=10) {
			  if (v%2==1) {
			  System.out.println(v);
		  }
			  v++;
		  }
		  
		  // EXAMPLE 4 : PRINT NUMBERS AND TYPE
		  
		  int S=1;
		  while(S<=10) {
			  if (S%2==1) {
				  System.out.println(" ODD : "+ S);
			  }
			  else {
				  System.out.println(" EVEN : "+ S);
			  }
			  S++;
		  }
		  
		  // EXAMPLE 5 : PRINT 9 TO 2
		  
		  int L=9;
		  while(L>=2) {
			  System.out.println(L);
			  L--;
		  }
		  
	}

}
