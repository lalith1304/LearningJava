package day9;

public class ReverseAString {

	public static void main(String[] args) {
		
	// Approach : 1 (BY using String class and length(),charAt() methods)
		
		String L = "YKCUL";
		String V = "";
		for(int v=L.length()-1;v>=0;v--) {
			V=V+L.charAt(v);
		}
      System.out.println("Reverse String is : "+ V);
      
    // Approach : 2 (By using String class and tocharArray method)
       
        L="YKCUL";
        V="";
        char v[]=L.toCharArray();
        for(int S=v.length-1;S>=0;S--) {
        	V=V+v[S];
        }
        System.out.println("Reverse String is : "+ V);
        
     // Approach 3 : (BY using StringBuffer class and inbuilt reverse method)
        
        StringBuffer l = new StringBuffer("YKCUL");
        System.out.println("Reverse String is : "+ l.reverse());
        
     // Approach 4 : (By using StringBuilder class and inbuilt reverse method)
        
        StringBuilder N = new StringBuilder("YKCUL");
        System.out.println("Reverse String is : "+ N.reverse());
	}

}
