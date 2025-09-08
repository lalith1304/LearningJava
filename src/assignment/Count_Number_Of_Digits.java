package assignment;

public class Count_Number_Of_Digits {

	public static void main(String[] args) {
		 int V=689689689 ;
		 int count=0;
		 while(V>0) {
			 V=V/10;
			 count++;
		 }
		System.out.println(count);
		 

	}

}
