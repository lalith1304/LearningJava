package day15;

class V {
	
	final int L = 8;
}

public class FinalKeyword {
	public static void main(String[] args) {
		
		V v = new V();
		
	//	v.L=200; // incorrect , because L is final variable
		System.out.println(v.L);

	}

}
