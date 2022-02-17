package org.java;

public class Employee extends Company {

	public Employee() {
	
	System.out.println("Default Constructor");
}
	
	public static void main(String[] args) {
		Employee e = new Employee();
	}
	
	
	
}
//public Employee(String name) {
//	super(name);
//	System.out.println("Employee Company Name : "+name);
//	
//}
//public Employee(int empid) {
//	
//	System.out.println("Employee ID : "+empid);
//	
//}
//public Employee() {
//	this("TCS");
//	System.out.println("Employee Detail");
//}
//public static void main(String[] args) {
//	
//	Employee emp = new Employee();
//	
//	
//			}
//