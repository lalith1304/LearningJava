package assignment;

public class Removing_Special_Characters_In_A_String {

	public static void main(String[] args) {
		String s = "!@#$%^&*:;<,.?> testing selenium java 1234567890";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
