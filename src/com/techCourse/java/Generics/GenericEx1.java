package com.techCourse.java.Generics;


class Sample<T> {
	T value;
	public Sample(T value) {
		this.value = value;
	}
	public T getValue() {
		return this.value;
	}
}
public class GenericEx1 {

	public static void main(String[] args) {
		Sample<Integer> s1 = new Sample<Integer>(10);
		System.out.println(s1.value);
		
		Sample<Double> s2 = new Sample<Double>(10.5);
		System.out.println(s2.value);
		
		Sample<String> s3 = new Sample<String>("abc");
		String value = s3.getValue();
		System.out.println(value);
		
		Sample<String> s4 = new Sample<String>("abc");
		String val = s4.getValue();
		System.out.println(val);
	}

}
