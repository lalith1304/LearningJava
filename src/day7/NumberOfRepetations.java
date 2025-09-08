package day7;

public class NumberOfRepetations {

	public static void main(String[] args) {
		int []L = {6,8,9,8,6,9,9,9,9,9,9,9,9};
		int S=9;
		int v=0;
		
		for(int V:L) {
			if(S==V) {
				v++;
			}
		}
		System.out.println(v);

	}

}
