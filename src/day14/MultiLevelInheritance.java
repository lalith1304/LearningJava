package day14;

class Parent{
	String V = "Parent";
	void display() {
		System.out.println(V);
	}
}

class Child1 extends Parent{
	String L = "Child1";
	void show() {
		System.out.println(L);
	}
}

class Child2 extends Child1{
	String v = "Child2";
	void print() {
		System.out.println(v);
	}
}

class Child3 extends Child2{
	String S = "Child3";
	void println() {
		System.out.println(S);
	}
}

class Child4 extends Child3{
	String K = "Child4";
	void through() {
		System.out.println(K);
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		Child4 s = new Child4();
		System.out.println(s.V);
		System.out.println(s.L);
		System.out.println(s.v);
		System.out.println(s.S);
		System.out.println(s.K);
		s.display();
		s.show();
		s.print();
		s.println();
		s.through();

	}

}
