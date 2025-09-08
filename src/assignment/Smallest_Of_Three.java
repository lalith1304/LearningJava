package assignment;

public class Smallest_Of_Three {

	public static void main(String[] args) {
		int a=6,b=8,c=9;
		
		if(a<b && a<c) {
			System.out.println("a is the smallest");
		}
		else if(b<a && b<c) {
			System.out.println("b is the smallest");
		}
		else {
			System.out.println("c is the smallest");
		}
	}
}
