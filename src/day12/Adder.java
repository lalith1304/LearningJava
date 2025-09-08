package day12;

public class Adder { // overloading by using methods
	
	int L=8 , V=6;
	
	void sum() {
		System.out.println(L+V);
	}
	
	void sum(int v , int s){
		System.out.println(v+s);
	}
	
	void sum(int v, double s) {
		System.out.println(v+s);
	}
	
	void sum(double v, int s) {
		System.out.println(v+s);
	}
	
	void sum(int L, int V, int v) {
		System.out.println(L+V+v);
	}

}
