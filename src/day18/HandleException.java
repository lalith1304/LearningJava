package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
        System.out.println("program is stated");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try {
		System.out.println(100/num); 
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("invalid data");
		}
		System.out.println("program is completed");
		System.out.println("program is executed");

	}

}
