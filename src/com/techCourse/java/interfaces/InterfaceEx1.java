package com.techCourse.java.interfaces;

interface Calculator { 
	double PI = 3.14159; // public static final
	
	int add(int a, int b); //public abstract
	int sub(int a, int b);
	double sin(double deg);
}

class BasicCalculator implements Calculator {

	@Override
	public int add(int a, int b) {
		return  a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public double sin(double deg) {
		return Math.sin(deg * PI /100);
	}}


public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator;
		calculator = new BasicCalculator();
		System.out.println(calculator.add(5, 90));
		System.out.println(calculator.sub(5, 90));
		System.out.println(calculator.sin(90));

	}

}
