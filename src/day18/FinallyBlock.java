package day18;

public class FinallyBlock {

	public static void main(String[] args) {
	    

		System.out.println("program started");
		
		String N = "welcome";
		try {
		System.out.println(N.length());
		}
		catch (ArithmeticException e) {
			System.out.println("catch block handled exception");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("entered into finally block");
		}
		System.out.println("program completed");
	}

}
