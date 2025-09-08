package day11;

public class Greetings {
	
	// no parameters no return value
	void m1(){
		System.out.println("hello");
	}
	
	// no parameters return's value
	String m2(){
		return ("Hello how are you??");
	}
	
	// parameters no return value
	void m3(String name) {
		System.out.println("hello" + name);
	}
	
	// parameters returns value
	String m4(String name){
		return ("Hello : "+name);
		
	}
	

}
