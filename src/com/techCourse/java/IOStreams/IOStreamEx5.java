package com.techCourse.java.IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopyUtils {
	public static void copy (FileOutputStream fileOut, FileInputStream fileIn ) throws IOException {
		byte [] buffer = new byte[1024];
		int n;
				
		while ((n = fileIn.read(buffer)) > -1) {
			fileOut.write(buffer, 0, n);
		}
		
	}
}

public class IOStreamEx5 {
	public static void main(String[] args) throws IOException  {
		File basePath = new File(System.getProperty("user.dir") + "\\src\\com\\techCourse\\java\\IOStreams");
		File srcFile = new File(basePath, "src.txt");
		File destFile = new File(basePath, "dest.txt");
		FileInputStream fileIn = new FileInputStream(srcFile);
		FileOutputStream fileOut = new FileOutputStream(destFile);
		
		try {
			FileCopyUtils.copy(fileOut, fileIn);			 
		} finally {
			fileIn.close();
			fileOut.close();			
		}
		
		// or
		
		try (FileInputStream fileIn2 = new FileInputStream(srcFile);
			 FileOutputStream fileOut2 = new FileOutputStream(destFile);){
			FileCopyUtils.copy(fileOut2, fileIn2);			 
		} 
		

	}
}
