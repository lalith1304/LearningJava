package day5;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int v=2;v<=9;v++) {
			if (v==8) {
				continue;
			}
			System.out.println(v);
		}
	}
}
