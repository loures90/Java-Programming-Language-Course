package com.techCourse.java.inheritance;

class BasicCalculatorComposition {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}

class ScientificCalculatorComposition {
	private static final double PI = 3.1417;
	BasicCalculatorComposition bcalc = new BasicCalculatorComposition();
	
	public int add(int a, int b) {
		return bcalc.add(a, b);
	}
	public int sub(int a, int b) {
		return bcalc.sub(a, b);
	}
	
	public double sin(double degree) {
		double rad = degree * PI /180;
		return Math.sin(rad);
	}
}

public class CompositionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCalculatorComposition calc1 = new ScientificCalculatorComposition();
		System.out.println("add: " + calc1.add(3, 5));
		System.out.println("sub: " + calc1.sub(3, 5));
		System.out.println("sin: " + calc1.sin(30));
		
		// not valid as an inheritance, there is no (Is A) contract relations between them 
//		BasicCalculatorComposition calc2 = new ScientificCalculatorComposition();
//		System.out.println("add: " + calc2.add(3, 5));
//		System.out.println("sub: " + calc2.sub(3, 5));
//		System.out.println("sin: " + calc2.sin(30)); No contract for sin
		
		BasicCalculatorComposition calc3 = new BasicCalculatorComposition();
		System.out.println("add: " + calc3.add(3, 5));
		System.out.println("sub: " + calc3.sub(3, 5));
	}
	
	

}
