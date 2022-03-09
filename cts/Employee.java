package org.cts;

public class Employee extends Company{
	public Employee() {
		this(56);
		System.out.println("IM A DEFAULT");
	}
	public  Employee(String name ) {
		this();
		
		System.out.println("Employee Name:"+ name);
		}
	public  Employee(int age ) {
		super("Greens");
		
		System.out.println("Employee age:"+ age);
		}
public static void main(String[] args) {
	Employee e = new Employee("ABINASH");
}
}
