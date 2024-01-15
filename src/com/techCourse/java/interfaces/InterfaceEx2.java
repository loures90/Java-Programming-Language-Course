package com.techCourse.java.interfaces;

interface A {
	void f();
}

interface B {
	void g();
}

interface C extends A, B{
	void h();
}

class D implements A, B, C {
	@Override
	public void f() {
		System.out.println("f() ");		
	}
	@Override
	public void g() {
		System.out.println("g() ");	
	}
	@Override
	public void h() {
		System.out.println("h() ");	
	}
	public void i() {
		System.out.println("i() ");		
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		A a = new D();
		a.f();
//		a.g();  it is not right, type A only has f() method
		
		B b = new D();
//		b.f(); it is not right, type B only has g() method
		b.g();
		
		
		C c = new D();
		c.f(); 
		c.g();
		c.h();
		
		
		D d = new D();
		d.f(); 
		d.g();
		d.h();
		d.i();
	}

}
