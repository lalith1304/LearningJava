 package day10;

public class Employee {   // this is an employee class  
	
// variables
	int eid;
	String ename;
	String job;
	int sal;
	
// Methods
	void display(){
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		// here we are creating objects and assigning data
		Employee emp1 = new Employee();// object created
		emp1.eid=888;
		emp1.ename="Lalith Kumar";
		emp1.job="Test Engineer";
		emp1.sal=50000;
		System.out.println(emp1.eid);// we can print like this also 
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.eid=777;
		emp2.ename="Lalith Kumar";
		emp2.job="engineer";
		emp2.sal=170000;
		emp2.display();
		

	}

}
