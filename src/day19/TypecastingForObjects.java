package day19;

//Cat ct=(Cat) an;
//--  --  --   --
//A   b   C    d

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

public class TypecastingForObjects {

	public static void main(String[] args) {
		
		// Rule 1 : Conversion is valid or not
		// The type of 'd' and 'C' must have some relationship(either parent to child or child to parent)
		
/*		Animal an = new Dog(); 
		Cat ct=(Cat) an; // rule one satisfied  */
		
	//	Dog dg = new Dog();
	//	Cat ct = (Cat) dg; // we cannot write like this
		
		// Rule 2 : Assignment is valid or not 
		// 'C' must be either same or child of 'A'
		
/*		Animal an = new Dog();
		Cat ct = (Cat) an; // rule two satisfied */ 
		
	//	Animal an = new Dog();
	//	Cat ct = (Dog) an; // we cannot write like this
		
		// Rule 3: The underlying object type of 'd' must be either same 0r child of 'C'
		
		Animal an = new Dog();
		Dog dg = (Dog) an; // rule three is satisfied 
		                  // rule one , two , three are satisfied 
		
		Animal a = new Cat();
		Cat c = (Cat) a;

	}

}
