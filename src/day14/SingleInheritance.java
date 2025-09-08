package day14;

	class Parents{
		String L = "Parent Class";
		void display() {
			System.out.println(L);
		}
	}
	
	class Child extends Parents{
		String V = "Child Class";
		void show() {
			System.out.println(V);
		}
	}
	
	
  public class SingleInheritance { 
	  
	public static void main(String[] args) {
			Child v = new Child();
      System.out.println(v.L);
      System.out.println(v.V);
      
      v.display();
      v.show();
	}

}
