package com.techCourse.java.Enums;

enum Color {
	RED("ff0000"),
	GREEN("00ff00"),
	BLUE("0000ff");
	
	private String code;
	Color(String code) {
		this.code = code; 
	}
	public String getCode() {
		return code;
	}
}


public class EnumsEx2 {
	public static void printColor(Color color) {
		System.out.println("Color: " + color);
		System.out.println("Color code: " + color.getCode());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printColor(Color.RED);
		System.out.println(Color.valueOf("GREEN"));
		
	}

}
