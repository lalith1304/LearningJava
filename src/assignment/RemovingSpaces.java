package assignment;

public class RemovingSpaces {

	public static void main(String[] args) {
		String L = "L  U  C  K  Y";
		L=L.replaceAll("\\s","");
		System.out.println(L);
	}

}
