package com.techCourse.java.constructors;

class Sample {
	// Initializer -> runs once for class declaration
	static {
		System.out.println("Static Initializer - Only once");
	}
	
	// Initializer -> runs once for each object created
	{
		System.out.println("Non Static Initializer - for object");
	}
	
	
	// Constructors
	public Sample (){
		System.out.println("Constructor without argunment");
	}
	public Sample (String value){
		System.out.println("Constructor with argunment " + value);
	}
	
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Sample s1, s2;
		s1 = new Sample();
		s2 = new Sample("value 1");
	}
}
