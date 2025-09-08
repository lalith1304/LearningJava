package day11;

public class Constructor {
	
	int x,y;
	
	Constructor(){ //default constructor
		x=6;
		y=8;
	}
	
	Constructor(int a, int b){ // parameterized constructor
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
	//	Constructor L = new Constructor(); // invoke default constructor
	    Constructor V = new Constructor(8,6); // parameterized constructor
		V.sum();
		

	}

}
