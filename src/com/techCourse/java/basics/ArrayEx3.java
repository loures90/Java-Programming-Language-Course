package com.techCourse.java.basics;

import java.util.Scanner;

public class ArrayEx3 {
	static boolean search(int[] arr, int value) {
		for(int el : arr) {
			if(el == value) {
				return true;
			}
		}
		return false;
	}
	
	public static void  main (String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60};
		int p;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert a number to be found");
		p = scan.nextInt();
		
		boolean isFound = search(arr, p);
		if (isFound) {
			System.out.println( p + " was found");
		} else {
			System.out.println( p + " was not found");
		}
	}
}
