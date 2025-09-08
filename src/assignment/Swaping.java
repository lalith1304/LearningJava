package assignment;

public class Swaping {

	public static void main(String[] args) {
		int a=6;
		int b=9;
		
	// this is using by multiplication and division ,it is used when both the variables have values expect zero.	
	/*	a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
    */ 
		
	// this is using addition and subtraction , the variable may be zero still it works
		a=a+b; //a=6+9=15
		b=a-b; //b=15-9=6 , b=6
		a=a-b; //a=15-6=9 , a=9
		System.out.println(a);
		System.out.println(b);
	}

}
