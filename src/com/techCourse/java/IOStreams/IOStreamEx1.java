package com.techCourse.java.IOStreams;

import java.io.File;
import java.io.IOException;

public class IOStreamEx1 {

	public static void main(String[] args) throws IOException {
		
		File basePath = new File(System.getProperty("user.dir") + "\\src\\com\\techCourse\\java\\IOStreams");
		System.out.println(basePath.isDirectory());
		System.out.println(basePath.getPath());

		File f = new File(basePath, "a.txt");
		f.createNewFile();
		System.out.println(f.getName() + " - length: " + f.length());
		
		File f2 = new File(basePath, "b.txt");
		if (f2.isFile()) {
			System.out.println(f2.getName() +  " exist.");
		} else {
			System.out.println(f2.getName() +  " does not exist.");
		}		
	}
}
