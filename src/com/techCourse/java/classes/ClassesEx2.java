package com.techCourse.java.classes;

class PositiveInteger {
	private int x;
	
	public void set(int value){
		if (value > 0) {
			x = value;			
		}
	}
	
	public int get(){
		return x;
	}
}

public class ClassesEx2 {

	public static void main(String[] args) {
		PositiveInteger p = new PositiveInteger();
		p.set(999);
		System.out.println(p.get());
		p.set(-99);
		System.out.println(p.get());
		p.set(4);
		System.out.println(p.get());
	}

}
