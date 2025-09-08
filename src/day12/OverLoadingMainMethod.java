package day12;

public class OverLoadingMainMethod {
	
	void main(int x) {
		System.out.println(x);
	}
	
	void main(String L) {
		System.out.println(L);
	}
	
	void main(String V,String v) {
		System.out.println(V+v);
	}

	public static void main(String[] args) {
		
		OverLoadingMainMethod ov = new OverLoadingMainMethod();
		ov.main(56000000);
		ov.main("LUCKY");
		ov.main("VARSHA", "varsha");

	}

}
