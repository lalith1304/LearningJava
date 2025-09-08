package day7;

public class SearchingAnElementUsingLinearSearch {

	public static void main(String[] args) {
		int []L= {6,8,9};
		int V=9;
				
		boolean S=false; // false = not found // true = found
		
		for(int v=0;v<L.length;v++) { // for enhanced we directly write a variable and we check
			if(L[v]==V) {
			  System.out.println("Element Found");
			 S=true;
			  break;
			}
		}
		if(S==false) {
		
			System.out.println("Element Not Found");
		}
	}

	

}
