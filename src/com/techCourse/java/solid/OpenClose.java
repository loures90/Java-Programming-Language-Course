package com.techCourse.java.solid;


/*
 * O. Open Close Principle: Objects and entities should be open to extension and closed to modification 
 * */
interface ValueComparator {
	public boolean compare(int a, int b);
}

class AscComparator implements ValueComparator {
	public boolean compare(int a, int b) {
		return a >= b;
	}
}

class DescComparator implements ValueComparator {
	public boolean compare(int a, int b) {
		return a <= b;
	}
}


class ArrayUtil { 
	public static void sort(int[] arr, ValueComparator comparator) {
		for (int i = 0; i < arr.length; i++  ) {
			for (int j = 0; j < i; j++  ) {
				if (comparator.compare(arr[i], arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

public class OpenClose {

	public static void main(String[] args) {
		int[] arr = {9, 1, 20, 4, 8};
		ArrayUtil.sort(arr, new AscComparator());
		for (int ele : arr) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		ArrayUtil.sort(arr, new DescComparator());
		for (int ele : arr) {
			System.out.println(ele);
		}
	}

}
