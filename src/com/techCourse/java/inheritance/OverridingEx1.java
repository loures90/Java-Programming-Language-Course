package com.techCourse.java.inheritance;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("name: " + this.name);
	}
}

class Contact extends Person {
	private String address;
	public Contact (String name, String address) {
		super(name);
		this.address = address;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("name: " + address);
	}
	
//	public void printAddress() {
//		System.out.println("name: " + address);
//	}
}

public class OverridingEx1 {

	public static void main(String[] args) {
		Contact c1 = new Contact("Jose", "Belos ");
		
		// with override
		c1.print();
		
//		without Override
//		c1.print();
//		c1.printAddress();
	}

}
