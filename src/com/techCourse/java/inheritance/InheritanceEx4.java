package com.techCourse.java.inheritance;

class BasicCalc {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}

class ScientificCalc extends BasicCalc {
	private static final double PI = 3.1417;
	
	public double sin(double degree) {
		double rad = degree * PI /180;
		return Math.sin(rad);
	}
}

public class InheritanceEx4 {

	public static void main(String[] args) {
		test(new BasicCalc());
		System.out.println("------------");
		test(new ScientificCalc());
	}
	
	static void test(BasicCalc calc) {
		System.out.println("add:" + calc.add(2, 3));
		System.out.println("sub:" + calc.sub(2, 3));
		if (calc instanceof ScientificCalc) {
			System.out.println("sin:" + ((ScientificCalc)calc).sin(30));//type cast
		}
	}
	
	

}
