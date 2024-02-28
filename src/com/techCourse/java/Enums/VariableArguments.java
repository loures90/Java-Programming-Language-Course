package com.techCourse.java.Enums;


public class VariableArguments {
	public static int sum(int ... a) {
		int result = 0;
		for (int value : a) {
			result += value;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2,3,4));
		
	}

}
