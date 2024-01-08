package com.techCourse.java.inheritance;

// Dynamic Binding

class Base {
	public void f() {
		System.out.println("f() Base method");
	}
	public void g() {
		System.out.println("g() Base method");
	}
}

class Derived extends Base {
	public void f() {
		System.out.println("f() Base method");
	}
	public void h() {
		System.out.println("h() Base method");
	}
}

public class InheritanceEx3 {
	public static void main(String[] args) {
		Base b = new Derived();
		b.f();
		b.g();
//		b.h(); method h() is undefined because the compiler consider type Base
		System.out.println();
		
		print(new Derived());
		System.out.println();
		print(new Base());
	}
	
	static void print(Base base) {
		base.f();
		base.g();
		if (base instanceof Derived ) { //Dynamic Binding
			((Derived) base).h(); // Cast Type
		}
	}

}
