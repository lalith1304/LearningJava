package assignment;

public class Palindrome_Number {

	public static void main(String[] args) {
	/*	int rev=0,num=1241;	
		int V=num;
		for(;num>0;num=num/10) {
			rev=rev*10+num % 10;
		}
		System.out.println(rev);
		
		
		if(rev==V) {
			System.out.println("true "+ V);
		}
		else {
			System.out.println("false "+ V);
		}*/
		int V=1111119 ; int R=0;
		int P=V;
		while(V>0) {
			R = R*10+V%10;
			V=V/10;
		}
		System.out.println(R);
		
		if(P==R) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}

