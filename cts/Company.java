package org.cts;

public class Company  {
	public Company() {
		System.out.println("IM a Company default Company");
	}
	public Company(String name) {
		this(2001);
		System.out.println("Company Name:"+ name);
	}
	public Company(int year) {
		this();
		System.out.println("Company start"+ year);
	}
	
}
