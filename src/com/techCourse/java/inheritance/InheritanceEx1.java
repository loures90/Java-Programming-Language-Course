package com.techCourse.java.inheritance;

class BasicCalculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}

class ScientificCalculator extends BasicCalculator {
	private static final double PI = 3.1417;
	
	public double sin(double degree) {
		double rad = degree * PI /180;
		return Math.sin(rad);
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCalculator calc1 = new ScientificCalculator();
		System.out.println("add: " + calc1.add(3, 5));
		System.out.println("sub: " + calc1.sub(3, 5));
		System.out.println("sin: " + calc1.sin(30));
		
		// Is A relationship
		BasicCalculator calc2 = new ScientificCalculator();
		System.out.println("add: " + calc2.add(3, 5));
		System.out.println("sub: " + calc2.sub(3, 5));
//		System.out.println("sin: " + calc2.sin(30)); No contract for sin
		
		BasicCalculator calc3 = new BasicCalculator();
		System.out.println("add: " + calc3.add(3, 5));
		System.out.println("sub: " + calc3.sub(3, 5));
	}
	
	

}
