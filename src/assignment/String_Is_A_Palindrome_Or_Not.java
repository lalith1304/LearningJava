package assignment;

public class String_Is_A_Palindrome_Or_Not {

	public static void main(String[] args) {
		String L = "MADAM";
		String v ="";
		
			
		for(int V = L.length()-1;V>=0;V--) {
			
			v=v+L.charAt(V);
		}
		System.out.println(v);
		System.out.println(L);
	if(v.equals(L)) {
       System.out.println("palindrome");
		}
		else { 
			System.out.println("not a palindrome");
	}
	}
}

