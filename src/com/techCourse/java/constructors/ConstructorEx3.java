package com.techCourse.java.constructors;

// Object creation must match one of the method constructors.
class ComplexNumber {
	private int real, img;
	
	public ComplexNumber() {
		this(1, 1); // arg constructor call
	}
	
	public ComplexNumber(int real) {
		this.img =0;
		this.real = real;
	}
	
	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img =img;
	}
	
	public void print () {
		System.out.println("real: " + real + " - img: " + img);
	} 
}

public class ConstructorEx3 {
	public static void main(String[] args) {
		ComplexNumber c1, c2, c3;
		c1 = new ComplexNumber();
		c2 = new ComplexNumber(2);
		c3 = new ComplexNumber(2,5);
		
		c1.print();
		c2.print();
		c3.print();
	}
}
