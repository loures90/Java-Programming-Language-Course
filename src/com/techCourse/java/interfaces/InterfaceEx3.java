package com.techCourse.java.interfaces;

interface ITest {
	void f();
	default void g() { // does not break the contract of classes Demo1 and Demo2
		System.out.println("g()");
	}
	public static void h() { // Another way to insert a method without breaking the contract with the class
		System.out.println("h()");
	} 
}

class Demo1 implements ITest {
	public void f() {
		System.out.println("Demo 1 ");
	}
}

class Demo2 implements ITest {
	public void f() {
		System.out.println("Demo 2 ");
	}
}

public class InterfaceEx3 {

	static void test(ITest itest) {
		itest.f();
		itest.g();
		ITest.h();
	}
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		test(demo1);
		
		System.out.println();
		
		Demo2 demo2 = new Demo2();
		test(demo2);
	}

}
