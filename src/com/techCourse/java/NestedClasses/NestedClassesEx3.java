package com.techCourse.java.NestedClasses;

import java.util.Iterator;

class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName ) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private Person() {}
	public void display() {
		System.out.println("Person name is " + firstName + " " + lastName);
	}
	
	static class Builder {
		public Person internalState = new Person();
		
		public Builder withFirstName(String firstName) {
			// implement some validations
			internalState.firstName = firstName;
			return this;
		} 
		public Builder withLastName(String lastName) {
			// implement some validations
			internalState.lastName = lastName;
			return this;
		} 
		public Person build() {
			return internalState;
		}
	}
	
}

public class NestedClassesEx3 {

	public static void main(String[] args) {
//		Person p = new Person("a", "b");
//		p.display();
		
		Person.Builder personBuilder = new Person.Builder();
		Person person = personBuilder
				.withFirstName("a")
				.withLastName("b")
				.build();
		person.display();
		
		Person p1 = new Person.Builder()
				.withFirstName("c")
				.withLastName("d")
				.build();
		p1.display();
	}

}
