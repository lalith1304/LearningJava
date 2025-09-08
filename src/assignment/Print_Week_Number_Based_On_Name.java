package assignment;

public class Print_Week_Number_Based_On_Name {

	public static void main(String[] args) {
		String week="thu";
		
		switch(week) {
		case "mon" : System.out.println(1);break;
		case "tue" : System.out.println(2);break;
		case "wed" : System.out.println(3);break;
		case "thu" : System.out.println(4);break;
		case "fri" : System.out.println(5);break;
		case "sat" : System.out.println(6);break;
		case "sun" : System.out.println(7);break;
		default : System.out.println("check");
		}

	}

}
