package day16;

interface Shape{
	int l=7 ; // final & Static 
	int v=6 ; // final & Static
	
	void circle(); // abstract method
	
	default void square() { // default method
		System.out.println("This is a square");
	}
	
	static void rectangle(int L , int V ) { // static method
	   L = l;
	   V = v;
	}
	
}

public class InterfaceDemo implements Shape {
	
	public void circle() {
		System.out.println("This is circle");
	}
	
	void triangle() {
		System.out.println("Triangle");
	}
	
	int L=7;
	int V=6;
	
	public static void main(String[] args) {
		
		// scenario1
		Shape i = new InterfaceDemo(); // IMPLEMENTATION
		i.circle();
		i.square();
		Shape.rectangle(7, 6); // static method can directly access from interface
	// 	i.triangle(); // we cannot access because it is inside the class , not in interface
		
		// scenario 2
		InterfaceDemo c = new InterfaceDemo(); // extends 
		c.circle();
		c.square();
		Shape.rectangle(7, 6); // static methods can directly access from interface 
		System.out.println(Shape.l * Shape.v); // static variables can directly access from interface
		c.triangle(); //  we can access because it is related to class

	}

}
