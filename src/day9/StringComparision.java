package day9;

public class StringComparision {

	public static void main(String[] args) {
		
		//scenario : 1
		 String L = "Lucky";
		 String l = "Lucky"; 
		 System.out.println(L==l);
		 System.out.println(L.equals(l));
		 
		//scenario : 2
		 String V = new String("qwer");
		 String v = new String("qwer");
		 System.out.println(V==v); // it will compare the objects
		 System.out.println(V.equals(v)); // it will compare the values inside the objects
		 
		//scenario : 3
		 String S = new String("qwer");
		 String s = "qwer";
		 System.out.println(S==s);
		 System.out.println(S.equals(s));
		 
		//scenario : 4
		 String VV = new String("qwer");
		 String vv = "qwer";
		 String VVVV = VV;
		 System.out.println(VV==vv);
		 System.out.println(VV.equals(vv));
		 System.out.println(VV==VVVV);// true because they both are referring the same object
		 System.out.println(VV.equals(VVVV));
		 System.out.println(vv.equals(VVVV));
		 System.out.println(vv==VVVV);

	}

}
