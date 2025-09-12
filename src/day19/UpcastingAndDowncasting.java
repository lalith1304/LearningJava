package day19;

// Downcasting ----> converting data from higher to smaller
   // like int to byte
   // double to float

// Upcasting ----> converting data from smaller to higher
   // like byte to int
   // float to double


public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		
		//downcasting
		
		int i = 1234;
		byte b = (byte)i; // by adding byte in front of variable i we are explicitly converting the data
		System.out.println(b);
		
		double d = 123456.123456;
		float f = (float)d;
		System.out.println(f);
		
		//upcasting
		
		byte bb = 123;
		int ii = bb ;
		System.out.println(ii);
		
		float ff = 10.5F;
		double dd = ff;
		System.out.println(dd);

	}

}
