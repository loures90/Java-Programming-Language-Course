package com.techCourse.java.basics;

public class ArrEx2 {
	static void print (int b[]) {
		for(int i =0; i < b.length; i++) {
			System.out.println(b[i]);
			b[i] = b[i] * 10;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30};
		print(arr);
		// array is a pointer to a memory space
		// and it values are modified inside the called function
		print(arr);
	}

}
