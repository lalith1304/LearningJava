package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		 
	// int num=20; // hard coded value
		
		Scanner sc=new Scanner(System.in); // Scanner class
		
		System.out.println("Enter a Number : ");
		int L = sc.nextInt();
		System.out.println("Given Number is : "+ L);
		
		System.out.println("Enter a Decimal Number : ");
		Double V = sc.nextDouble();
		System.out.println("Given Decimal NUmber : " + V);
		
		System.out.println("Enter Your City : ");
		String S = sc.next();
		System.out.println("Your City is : " + S);
		
		System.out.println("Enter a Boolean Value : ");
		boolean v = sc.nextBoolean();
		System.out.println("Given Boolean Value is : " + v);

	}

}
