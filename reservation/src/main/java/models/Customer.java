package models;

public class Customer {
	
	private String name;
	private String passNumber;
	
	public Customer(String name , String passNum){
		this.name = name;
		this.passNumber = passNum;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassNumber() {
		return passNumber;
	}
	public void setPassNumber(String passNumber) {
		this.passNumber = passNumber;
	}
}
