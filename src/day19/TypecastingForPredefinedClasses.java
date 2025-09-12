package day19;

public class TypecastingForPredefinedClasses {

	public static void main(String[] args) {
		
		
		// Ex1:
		Object O = new String("Good Time Started");
		String S = (String) O; // Rule one , two , three are satisfied 
		System.out.println(S); 
		
		//Example 2 :
		// Object o = new String(" ");
		//StringBuffer sb = (StringBuffer) o; // Rule 3 not correct
		
		//Example 3 :
	    // String s = new String(" ");
		//StringBuffer sb = (StringBuffer) s; // Rule 1 not correct
		
		//Example 4 :
		// Object o = new String(" ");
		//StringBuffer sb = (String) o; // Rule 2 not correct

	}

}
