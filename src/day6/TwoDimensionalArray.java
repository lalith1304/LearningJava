package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declaring Array (If it has fixed values)
		   
		 int L[][]= new int[3][3];// we can write [][]L OR []L[]
		 
		 L[0][0]=6;
		 L[0][1]=8;
		 L[0][2]=9;
		 
		 L[1][0]=6;
		 L[1][1]=8;
		 L[1][2]=9;
		 
		 L[2][0]=6;
		 L[2][1]=8;
		 L[2][2]=9;
		 
	    // Declaring Array(If it doesn't have any fixed type of data)
		  
		  int V[][] = {{6,8,9},{6,8,9},{6,8,9}};
		  
		// Finding the Size Of Array   
      
		  System.out.println("Length of the rows : "+L.length);
		  System.out.println("Length of the columns : "+L[2].length);
		  
		// Reading Single Value From Array
		  System.out.println(V[2][2]);
		  
		// Reading All the Rows And Columns(By using regular for loop)
		   
		   for(int r=0;r<L.length;r++) { // r<=2 also we can write
			   for(int c=0;c<L[r].length;c++){
				   System.out.print(L[r][c]+" ");
			   }
			   System.out.print(" L");
			   System.out.println();
		   }
		   
		// Reading All the Rows And Columns(By using enhanced for loop)
		    
		    for(int arr[]:V) {
		    	for(int X:arr) {
		    		System.out.print(X+" ");
		    	}
		    	System.out.print(" V");
		    	System.out.println();
		    }
}
	
}
