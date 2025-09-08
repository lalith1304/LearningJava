package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu = new Student();
		
		//1) using object reference variables
	/*	stu.sid=689;
		stu.name="Lalith";
		stu.grade='A';
	*/	
		//2) using method
		
	/*	stu.setstudentdata(689, "Lalith", 'A');
		stu.PrintStuentData();
	*/
		//3) using constructor
		Student stu = new Student(6899, "Lalith", 'A');
        stu.PrintStudentData();
	}

}
