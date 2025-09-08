package assignment;

public class Count_Occurance_Of_A_Character_In_String {

	public static void main(String[] args) {
		String L = "Lucky is my food which i will have soon";
        int total_length = L.length();
        int length_after_o = L.replace("o","").length();
        int count = total_length-length_after_o;
        System.out.println("count of o : " + count);
        
	}

}
