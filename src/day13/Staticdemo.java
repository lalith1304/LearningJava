package day13;

public class Staticdemo {
	
	static int a =6; // static variable
	int b =8; // non static variable
	
	static void m1() {
		System.out.println("this is a static method m1");
	}
	
	void m2() {
		System.out.println("this is a non static method m2");
	}
	
	/*public static void main(String[] args) { // main method is also a static method
		  
		System.out.println(a); // we can access static variables and static methods directly with out object.
		m1();
		
		Staticdemo v = new Staticdemo();
		System.out.println(v.b);
		v.m2();

	}*/

}
