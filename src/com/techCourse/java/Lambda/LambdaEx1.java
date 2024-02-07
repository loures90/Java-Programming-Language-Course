package com.techCourse.java.Lambda;

interface MyMath {
	public Integer add(Integer a, Integer b);
}

class MyMathImpl implements MyMath {

	@Override
	public Integer add(Integer a, Integer b) {
		return a+b;
	}}

public class LambdaEx1 {

	public static void main(String[] args) {
		// lambda
		MyMath m = (a, b) -> a + b;
		System.out.println(m.add(10,33));
		
		MyMath m2 = new MyMathImpl();
		System.out.println(m2.add(3, 4));
		
		// anonymous
		MyMath m3 = new MyMath(){
			public Integer add(Integer a, Integer b) {
				return a+b;
			}
		};
		System.out.println(m3.add(9, 4));
	}

}
