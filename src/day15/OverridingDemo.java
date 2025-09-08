package day15;

class Bank{
	double roi() {
		return 0;
	}
}

class ICICI extends Bank{
	double roi() {
		return 6.9;
	}
}

class SBI extends Bank{
	double roi() {
		return 8.12;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		ICICI V = new ICICI();
		System.out.println(V.roi());
		
		SBI L = new SBI();
		System.out.println(L.roi());

	}

}
