package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder add = new Adder();
		
		add.sum();//1
		
		add.sum(8, 9);//2
		
		add.sum(8, 9.0);//3
		
		add.sum(8.0, 9);//4
		
		add.sum(7, 6, 8);//5

	}

}
