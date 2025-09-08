package assignment;

public class Reverse_Of_Numbers {

	public static void main(String[] args) {
	/*	int num=3689;
		int rev=0;
      while(num>0){
    	  rev= rev * 10 + num % 10;
    	  num=num/10;
      } 
      System.out.print(rev); */
		
		for(int num=3689;num>0;) {
			int rev=0;
			rev=rev*10+num % 10;
			num=num/10;
			System.out.print(rev);
		}
	
	}
}
