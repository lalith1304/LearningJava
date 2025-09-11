package day17.pack2;
import day17.pack1.Test1;

// this is for protected
/*public class Test2 extends Test1{

	public static void main(String[] args) {
	// while we used extends for protected we need to get variables and methods through the child class object we can't directly create object for protected.	
		Test2 t2=new Test2();
		System.out.println(t2.x);
		t2.m1();
		
/*		Test1 t=new Test1();
		System.out.println(t.x);
		t.m1();
		

	}

} */

public class Test2 { // no need extends 

	public static void main(String[] args) {
	
		Test1 t=new Test1();
		System.out.println(t.x);
		t.m1();
		

	}

} 