package com.techCourse.java.Strings;

// Strings are immutable
public class StringEx1 {

	public static void main(String[] args) {
		String s = "abc";
		s = s + "xyz";
		System.out.println(s);
		
		String s1 = "pqr";
		String s2 = "pqr";
		String s3 = new String("pqr");

		if (s1 == s2) { // Comparing reference
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");			
		}
		
		if (s1 == s3) { // Comparing reference
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");			
		}
		
		StringBuilder sb = new StringBuilder("My first string,");
		sb.append(" my second,");
		sb.append(" my third.");
		String str = sb.toString();
		System.out.println(str);
		
		String str1 = "abc";
		String str2 = "ABC";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if (str1.compareTo(str2) > 0) {
			System.out.println("str1 > str2");
		} else if(str1.compareTo(str2) < 0) {
			System.out.println("str1 < str2");
		}else {
			System.out.println("str1 == str2");
		}
		// compareToIgnoreCase
	}

}
