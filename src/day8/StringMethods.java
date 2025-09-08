package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
	/*	// we can write string in two ways 
		// first method is
		 String L = "Lucky is my food";
		// second method is 
		 String l = new String("Lucky is my food"); */
		 
// From here we are going to see the methods
	// 1) length() - It is used to check the length of the string.(it will count the characters and it will give the length)
		 
		 String L = "Lucky is my favourite food";
		 System.out.println(L.length());
		 System.out.println("Lucky is my food".length());// we can give string directly, if we don't have variable.
	
	// 2) concat() - It is used to combine the string, here we can also use '+' operator.
		 
		 L = "Lucky is my favourite food";
		 String V = "BUt V is my permanent food";
		 System.out.println(L.concat(V));
		 
		 String S = "S is also my food";
		 String v = "v is also my food";
		 System.out.println(L.concat(V).concat(S).concat(v));
		 
	// 3) trim() - It is used to remove spaces in the string and it will remove spaces in both sides(right and left)
		 
		 L =" Lucky is my first favourite food and first food in my life ";
		 System.out.println(L.trim());
		 
	// 4) charAt() - Returns a character from a string based on index value given.
		 
		 L = "Lucky is my most favourite food of life";
		 System.out.println(L.charAt(38));
		 
	// 5) contains() - It returns TRUE or FALSE, by checking given string is present in main string or not.
         
		 L = "Lucky is my food that i should not miss in this life";
		 String l = "Lucky";
		 System.out.println(L.contains(l));// true
		 System.out.println(L.contains("Lucky"));//true
		 
	// 6) equals() - It will compares two string along with case sensitive.
	//    equalsIgnoreCase() - It will also compares two strings with out case sensitive.
		 
		 L = "Lucky";
		 l = "Lucky";
		 System.out.println(L.equals(l));// true
		 System.out.println(L.equals("Lucky"));// true
		 System.out.println(L.equals("lucky"));// false
		 
		 L= "Lucky";
		 l= "lucky";
		 System.out.println(L.equalsIgnoreCase(l));// true
		 System.out.println(L.equalsIgnoreCase("Lucky"));// true
		 System.out.println(L.equalsIgnoreCase("LUCKY"));// true
		 System.out.println(L.equalsIgnoreCase("LuCkY"));// true
		 
	// 7) replace() - It will replace single characters and multiple(sequence words) in a string.
		 
		  L = "Lucky is a food which i will remember for my life time and i will eat for m life time";
		  System.out.println(L.replace('l', 'L'));
		  System.out.println(L.replace("life","LIFE"));
		  
	// 8) substring() - It is used to extract substring from a string.
		  
		  L = "Lucky is my food,Panda,Healing,Headache and so on";
		  System.out.println(L.substring(0, 5));// Lucky
		  System.out.println(L.substring(12, 16));// food
		  
	// 9)  toUpperCase () - It is used to make an entire string to upper case.
	//	   toLowerCase () - It is used to make an entire string to lower case.
		  
		  L = "Lucky is not only food but an emotion";
		  System.out.println(L.toUpperCase());
		  System.out.println(L.toLowerCase());
		  
	// 10) split() - It is used to split the string into multiple parts based on delimeter .
		   
		   L = "Lucky@food i want to eat more.com";
		   String []x = L.split("@");
		   System.out.println(Arrays.toString(x));
		   System.out.println(x[0]);
		   System.out.println(x[1]);
		   
		// example:1 
		    String amount = "$6,8,9";
		    System.out.println(amount.replace("$","").replace(",",""));// 689
		   // we took double quotes because the single quotes don't accept empty value
		 
		// example:2
		    String Z ="abc,123@xyz";
		    
		    String arr1[]=Z.split(",");
		    System.out.println(Arrays.toString(arr1));// [abc , 123@xyz]
		    
		    String arr2[]=arr1[1].split("@");
		    System.out.println(Arrays.toString(arr2));// [123 , xyz]
		    
		    System.out.println(arr1[0]);
		    System.out.println(arr2[0]);
		    System.out.println(arr2[1]);
		    
		 // example:3
		    String Y = "abc 123 xyz";
		    String ar[]=Y.split(" ");
		    System.out.println(Arrays.toString(ar));// [abc, 123, xyz]
		    
		  // we can't use * % ^ & ( ) this symbols as delimeters // 
		    
		 // example:4 
		    String name = "John kenedy";
		    System.out.println(name.contains("John")); //false 
		    System.out.println(name.replace('J', 'j').contains("john"));//true
		    System.out.println(name.toLowerCase().contains("john"));//true
		
	}

}
