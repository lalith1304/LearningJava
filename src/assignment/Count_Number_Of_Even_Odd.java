package assignment;

public class Count_Number_Of_Even_Odd {

	public static void main(String[] args) {
		 int V=668899;
		 int even=0 , odd=0 , S=0 ;
      while(V>0) {
    	  S= S*10+V%10;
    	  V= V/10;
    	  if(S%2==0) {
    		  even++;
    	  }
    	  else {
    		  odd++;
    	  }
      }
      System.out.println("NUMBER OF EVEN : "+ even);
      System.out.println("NUMBER OF ODD : " + odd);
	}

}
