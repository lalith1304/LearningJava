package day17;

public class DataConvertionMethods {

	public static void main(String[] args) { // By using wrapper classes 
		
		// STRING--->INT
		
	//	String K = "hey";//we cannot convert , the data should be in numbers
		String V = "678";
		String L = "768";
		String v = "867";	
		System.out.println(Integer.parseInt(V)+Integer.parseInt(v)+Integer.parseInt(L));
		
		// STRING--->DOUBLE
		
		String VV = "10000";
		String LL = "768.9";
		String vv = "867.8";
		System.out.println(Double.parseDouble(vv)+Double.parseDouble(LL)+Double.parseDouble(VV));

		// STRING--->BOOLEAN
		
		String VVV = "True"; // other than true if you pass any string that will return false 
		System.out.println(Boolean.parseBoolean(VVV));
		
		
		// INTEGER,DOUBLE,BOOLEAN,CHAR--->STRING
		
		int vvvv = 6;
		double VVVV = 10000.9;
		char LLLL = 'S';
		boolean c = false;
		
		String s=(String.valueOf(vvvv));
		System.out.println(s);
		
		s=String.valueOf(VVVV);
		System.out.println(s);
		
		s=String.valueOf(LLLL);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
	}

}
