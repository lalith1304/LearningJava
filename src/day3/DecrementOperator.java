package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		// -- IS CALLED AS DECREMENT OPERATOR
		
				/*  in Case-1
				 int a=10;
				 System.out.println(a);//10
				 
				 a--;     //a=a-1;
				 System.out.println(a);//9
			    */

				/* Case-2 //post decrement
				 int a=10;
				 System.out.println(a); //10
				 
				 int res=a--;
				 System.out.println(res);//10
				 System.out.println(a);//9
				*/
				
				// CASE-3 //PRE DECREMENT
				 int a=10;
				 System.out.println(a);//10
				 
				 int res=--a;
				 System.out.println(res);//9
				 System.out.println(a);

	}

}
