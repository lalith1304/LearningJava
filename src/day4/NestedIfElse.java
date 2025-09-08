package day4;

public class NestedIfElse {

	public static void main(String[] args) {
		if(true) {
			if(true) {
				if(true) {
					if(true) {
						System.out.println("ALL");
					}
					else {
						System.out.println("V");
					}
				}
				else {
					System.out.println("L");
				}
			}
			else {
				System.out.println("S");
			}
		}
		else {
			System.out.println("v");
		}

	}

}
