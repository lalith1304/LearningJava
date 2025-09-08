package assignment;

public class Prime_Number {
	public static void main(String[] args) {
		int L=89;
		int count=0;
		
		if(L>1) {
			for(int i=1;i<=L;i++) {
				if(L%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Prime Number : "+ L);
			}
			else {
				System.out.println("Not a Prime Number : " + L);
			}
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
		}
		
	}


