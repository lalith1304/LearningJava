package day16;
// this is an hybrid inheritance , if we didn't add the class than it is a multiple inheritance 
public class Child extends C3 implements I1 , I2{
	
	public void v1() {
		System.out.println(v);
	}
	
	public void L1() {
		System.out.println(L);
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.v1();
		c.L1();
		c.V1();

	}

}
