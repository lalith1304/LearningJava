package day14;

class Permanent{
	String V = "Permanent";
	void life () {
		System.out.println(V);
	}
}

class Halfpermanent extends Permanent{
	String L = "Halfpermanent";
	void till() {
		System.out.println(L);
	}
}

class Shorttime extends Permanent{
	String v = "Shorttime";
	void truth() {
		System.out.println(v);
	}
}

class Temporary extends Permanent{
	String S = "Temporary";
	void taste() {
		System.out.println(S);
	}
}

class Sweet extends Permanent{
	String K = "Sweet";
	void recent() {
		System.out.println(K);
	}
}

public class HierarchyInheritance {
	public static void main(String[] args) {
		
		Sweet s = new Sweet();
		System.out.println(s.V);
		System.out.println(s.K);
		s.life();
		s.recent();

	}

}
