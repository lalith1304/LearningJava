package day11;

public class Student {
	
	int sid;
	String name;
	char grade;
	
	void PrintStudentData() {
		System.out.println(sid+"    "+name+"    "+grade);
	}
	
	void setstudentdata(int id, String sname, char gr ) { // local variables or method specific variables
		sid=id; // by using local variables we have assigned data to class variables
		name=sname;
		grade=gr;
	}
	
	Student(int id, String sname, char gr){
		sid=id;
		name=sname;
		grade=gr;
	}

}
