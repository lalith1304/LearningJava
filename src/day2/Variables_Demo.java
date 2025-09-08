package day2;

public class Variables_Demo {

	public static void main(String[] args) {
		
		int a; // declaration
		a=100; // assignment
		 System.out.println(a); //100  //"give only variable while you want to print it , you should not give a inside double quotations"

		 a=600; // changing the a value 
		 System.out.println(a); //600
		 
		 //Approach 1(declaration+assignment) - if all the variables are different
		 int A=600;
		 int B=800; 
		 int C=900;
		 System.out.println(A);
		 System.out.println(B);
		 System.out.println(C);  
		 
		 //Approach 2(declaration separate and assignment is also separate) - it is applicable when all the data types are same.
		 int b,c,d;
		 b=600;
		 c=800;
		 d=900;
		 System.out.println("value of b :"+b);
		 System.out.println("value of c :"+c);
		 System.out.println("value of d :"+d);
		 
		 //Approach 3 - it is applicable when all the data types are same.
		 int e=600,f=800,g=900;
		 System.out.println(e+" "+f+" "+g);
		 
	}

}
