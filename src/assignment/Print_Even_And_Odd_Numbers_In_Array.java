package assignment;

public class Print_Even_And_Odd_Numbers_In_Array {

	public static void main(String[] args) {
		int []L = {6,8,9,9};
		int E=0;
		int O=0;
		for(int V:L) {
			if(V%2==0) {
				E++;
			}
			else {
				O++;
			}
		}
		System.out.println(E);
		System.out.println(O);

	}

}
