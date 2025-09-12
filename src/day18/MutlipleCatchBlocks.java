package day18;

public class MutlipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		String N = null;
		try {
		System.out.println(N.length());
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("program completed");

	}

}
