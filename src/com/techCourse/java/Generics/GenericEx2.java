package com.techCourse.java.Generics;

/*
 *  Generics Methods
 * */


public class GenericEx2 {

	public static <T> void display(T [] arr) {
		for (T value : arr) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,6,7,8,8};
		display(arr);
		String arrS[] = {"abc", "bc", "ef"};
		display(arrS);
		Double arrD[] = {2.05,4.6, 3.14};
		display(arrD);
	}
}
