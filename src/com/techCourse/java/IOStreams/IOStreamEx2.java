package com.techCourse.java.IOStreams;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class FileUtils {
	public static void display(File[] files) {
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

class JavaFileFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
	
}

public class IOStreamEx2 {

	public static void main(String[] args) throws IOException {
		File baseDir = new File(System.getProperty("user.dir") + "\\src\\com\\techCourse\\java\\IOStreams");
		File[] files = baseDir.listFiles();
		FileUtils.display(files);
		
		System.out.println("\nOnly Java files \n");
		
		File[] javaFiles = baseDir.listFiles(new JavaFileFilter());
		FileUtils.display(javaFiles);
		
	}
}
