package com.techCourse.java.functions;

import java.util.Scanner;

public class FatorialPermutarion {

	public static void main(String[] args) {
		int n, r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n:");
		n = scan.nextInt();
		System.out.println("Enter r:");
		r = scan.nextInt();
		int fact = factorial(n)/(factorial(r)*(factorial(n-r)));
		System.out.println(fact);
	}
	
	static int factorial(int m) {
		int f = 1;
		for(int i =1; i<= m; i++) {
			f = f * i;
		}
		return f;
	}

}