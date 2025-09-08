package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		  int []L = new int[9];
		  
		  Scanner sc= new Scanner(System.in);
		  
		  for(int V=0;V<L.length;V++) {
			  System.out.print("Enter a value for the position "+V+": ");
			  L[V]=sc.nextInt();
		  }
		  System.out.println("printing array elements.........");
		  
		  System.out.println(Arrays.toString(L));

	}

}
