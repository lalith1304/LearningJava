package assignment;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		int V=999999999;
		int T=0; int S=0;
		while(V>0) {
			S=V%10;
			V=V/10;
			if(S!=0) {
				T=T+S;
			}
		}
		System.out.println(T);

	}

}
