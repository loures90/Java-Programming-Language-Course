package com.techCourse.java.abstracts;

abstract class Base {
	public void f() {
		System.out.println("f() in Base");
	}
	abstract public void g(); 
}

class Derived extends Base {
	@Override
	public void g() { 
		System.out.println("g() in Base");
	}
}

class DerivedB extends Base {
	public void h() {
		System.out.println("g() in Base");
	}

	@Override
	public void g() { // g is compulsory here, because it extends base and g is an abstract method.
		// TODO Auto-generated method stub
		
	}
}

public class abstractEx1 {

	public static void main(String[] args) {
		//Base base1 = new Base() Abstract class can not be instantiated
		Base base2 = new Derived(); // ** type base
		base2.f();
		base2.g();
		System.out.println();
		
		Derived base3 = new Derived(); // ** type Derived
		base3.f();
		base3.g();
		System.out.println();
		
		
	}

}
