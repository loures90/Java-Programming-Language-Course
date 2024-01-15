package com.techCourse.java.abstracts;

abstract class A {
	public void f() {
		System.out.println("f() in Base");
	}
	abstract public void g(); 
	abstract public void h();
	abstract public void i();
}

abstract class B extends A { // the abstract class don't need to create all abstracts methods from the base class.
	@Override
	public void g() { 
		System.out.println("g() in Base");
	}
}

class C extends B { // Concrete class has to start all the abstract methods from your Base classes
	@Override
	public void h() {
		System.out.println("h() in Base");
	}
	public void i() {
		System.out.println("i() in Base");
	}
}

abstract class D {
	public void g() { 
		System.out.println("g() in Base");
	}
}
class E extends D {
	
}


public class abstractEx2 {

	public static void main(String[] args) {
//		A a = new A();  // abstract class can not be instantiated
//		B b = new B();  // abstract class can not be instantiated
		C c = new C();
		c.f();
		c.g();
		c.h();
		c.i();
		
		D e = new E();
		e.g();
	}

}
