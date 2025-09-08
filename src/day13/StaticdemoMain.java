package day13;

public class StaticdemoMain {

	public static void main(String[] args) {
		System.out.println(Staticdemo.a); // we can access static variables and static methods directly with out object in another classes by adding the actual class name in front of the variable.
		Staticdemo.m1();
		
		Staticdemo v = new Staticdemo();
		System.out.println(v.b);
		v.m2();

	}

}
