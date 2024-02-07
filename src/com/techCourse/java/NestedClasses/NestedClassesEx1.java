package com.techCourse.java.NestedClasses;


class OuterClass {
	private Integer x = 10;
	
	public void test () {
		InnerClass interClass = new InnerClass();
		interClass.print();
	}
	class InnerClass {
		public void print() {
			System.out.println("x is: " + x);
		}
	}
}

public class NestedClassesEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerClass = new OuterClass();
		outerClass.test();
		
		OuterClass.InnerClass p = outerClass.new InnerClass();
		p.print();
	}

}
