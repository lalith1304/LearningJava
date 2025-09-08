package day4;

public class Largest_Of_3_Numbers {

	public static void main(String[] args) {
		int a=9, b=9, c=9;
		
		if(a>b && a>c) {
			System.out.println("a is largest number : "+a);
		}
		else if(b>c && b>a) {
			System.out.println("b is largest number : "+b);
		}
		else if(c>a && c>b) {
			System.out.println("c is the largest number: "+c);
		}
		else {
			System.out.println("non of the above : "+c);
		}
	}

}
