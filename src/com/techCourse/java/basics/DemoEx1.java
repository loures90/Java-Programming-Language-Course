package com.techCourse.java.basics;

import java.util.Scanner;

public class DemoEx1 {
	public static void  main (String[] args) {
		System.out.println("Hello World");
		double si, p, t, r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		p = scan.nextDouble();
		System.out.println("Enter tenure:");
		t = scan.nextDouble();
		System.out.println("Enter rate:");
		r = scan.nextDouble();
		si = p*t*r/100;
		System.out.println("Simple Interest - " + si);
	}
	
	
}