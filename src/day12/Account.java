package day12;

public class Account {// 'ENCAPSULATION' // using same name for variables and class , for that problem we are using this key word for representing class variables and we are using getters and setters methods.
	
	private int accno;
	private String name;
	private double amount;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
