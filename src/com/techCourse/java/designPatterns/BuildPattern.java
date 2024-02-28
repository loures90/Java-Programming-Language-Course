package com.techCourse.java.designPatterns;

class Person {
	private String firstName;
	private String lastName;
	private Person() {}
	public Person(Person other ) {
		this.firstName = other.getFirstName();
		this.lastName = other.getLastName();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void display() {
		System.out.println("Person name is " + firstName + " " + lastName);
	}
	
	
	 static class Builder {
		 
		 public Person internalPerson = new Person();
		 public Builder withFirstName(String name) throws Exception {
			 // It is interesting to make validations
			 if (name == "Test") {
				 throw new Exception();
			 }
			 internalPerson.setFirstName(name);
			 return this;
		 }
		 public Builder withLastName(String name) throws Exception {
			 // It is interesting to make validations
			 if (name == "Test") {
				 throw new Exception();
			 }
			 internalPerson.setLastName(name);
			 return this;
		 }
		 
		 public Person build()  {
			 return internalPerson;
		 }	 
	 }	
}

public class BuildPattern {

	public static void main(String[] args) throws Exception {
		
		Person.Builder personBuilder = new Person.Builder();
		Person person = personBuilder
				.withFirstName("a")
				.withLastName("b")
				.build();
		person.display();
	
	}

}
