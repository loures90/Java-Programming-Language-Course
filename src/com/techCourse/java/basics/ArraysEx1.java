package com.techCourse.java.basics;

import java.util.Scanner;

public class ArraysEx1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		int i;
		for (i=0; i < arr.length; i++) {
			System.out.printf("enter %d element \n", i);
			arr[i] = scan.nextInt();
		}
		System.out.println("The numbers are: ");
		for(int ele : arr) {
			System.out.println(ele);
		}
	}

}
