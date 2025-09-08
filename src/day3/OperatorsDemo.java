package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
	
	// ARTHMETIC OPERATORS.(+   -   *   /   %)
		
		int a=20,b=10;
		
		// IF WE WANT TO SAVE THE RESULT IN OTHER VARIABLE THAN 
		
		int result=a+b;
		System.out.println(result); 
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("diff of a and b is:"+(a-b));
		System.out.println("multiplication of a and b is:"+(a*b));
		System.out.println("division of a and b is:"+(a/b));
		System.out.println("modulo division of a and b is:"+(a%b));
		
	// RELATION/COMPARISION OPERATOR.(>   >=   <   <=   !=   ==) 	
    // RETURNS BOOLEAN VALUE - TRUE/FALSE.	
       
		    System.out.println(a>b); //true
		    System.out.println(a<b); //false
		    System.out.println(a>=b); //true
		    System.out.println(a<=b); //false
		
		    b=20;
		    System.out.println(a>=b); //true
		    System.out.println(a<=b); //true
		
		    System.out.println(a!=b); //false
		    System.out.println(a==b); //true
 		
		    // IF WE WANT TO SAVE THE RESULT IN OTHER VARIABLE THAN
		    boolean res=a>=b;
		    System.out.println(res);
		
	 // LOGICAL OPERATORS.(&&     ||    !)
     // RETURNS BOOLEAN VALUE - TRUE/FALSE.	
	 // IT WORKS BETWEEN TWO BOOLEAN VALUES.	    
		       
		    boolean f=true;
		    boolean e=false;
		    
		    System.out.println(f && e); //false
		    System.out.println(f || e); //true
		    System.out.println(!f); //false
		    System.out.println(!e); //true
		    
		    
		   boolean b1=10>20;
		   System.out.println(b1); //false
		   
		   boolean b2=20>10;
		   System.out.println(b2); //true
		   
		   System.out.println(b1 && b2); //false
		   System.out.println(b1 || b2); //true
		   
		   System.out.println((10<20) && (20>10));//combination of relational and logical operators.
		    
		    
	  	    
		     
		     
		
		
		
	}

}
