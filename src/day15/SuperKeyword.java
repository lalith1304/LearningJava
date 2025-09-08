package day15;

//This is a test comment to check Git staging

class Animal{
	String color="white";
	
	void eat() {
		System.out.println("eating.........");
	}
}

class Dog extends Animal{
	
	String color="black";
	
	void displaycolor() {
	    System.out.println(color);
		System.out.println(super.color);
	}
	
	void eat() {
		System.out.println("eating bread.........");
		super.eat();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog d=new Dog(); // before using super key word it is invoking child class only
		d.displaycolor(); // after using super key word it is invoking the immediate parent class variables and methods
		d.eat();
		

	}

}
