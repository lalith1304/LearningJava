package day13;

public class ThisKeyword {
	
	int x;
	int y;
	
	ThisKeyword(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void Display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		ThisKeyword TK = new ThisKeyword(8,6);
		TK.Display();

	}

}
