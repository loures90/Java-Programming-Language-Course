package com.techCourse.java.classes;

class Sample {
	int x;
	void set(int value) { x = value;}
	int get() {return x;}
}

public class ClassessEx1 {
	public static void main(String[] args) {
		int a= 10, b =33;
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		a++;
		b++;
		s1.set(a);
		s2.set(b);
		
		System.out.println(s1.get());
		System.out.println(s2.get());
	}
}
