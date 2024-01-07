package com.techCourse.java.constructors;

class PositiveInteger {
	private int x;
	public PositiveInteger() {
		this.x=0;
	}
	public PositiveInteger(int value) {
		this.x= value;
	}
	
	public void setInteger(int value){
		this.x = value; 
	}
	public int getInteger(){
		return this.x; 
	}
}
public class ConstructorEx2 {
	public static void main(String[] args) {
		PositiveInteger p1, p2;
		p1 = new PositiveInteger();
		p2 = new PositiveInteger(5);
		System.out.println("p1: " + p1.getInteger());
		System.out.println("p2: " + p2.getInteger());
	}
}
