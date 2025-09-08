package day15;

class ABC{
	void m1(int V) {
		System.out.println(V);
	}

	void m2(int L) {
		System.out.println(L);
	}
}

class XYZ extends ABC{ 
	void m1(int V) { // overriding
		System.out.println(V*V);
	}

	void m2(int S,int K) { // overloading
		System.out.println(S+K);
	}
}

public class OverridingVsOverLoading {
	public static void main(String[] args) {
		
		XYZ v = new XYZ();
		v.m1(6);
		v.m2(8);
		v.m2(6, 12);
		
	}

}
