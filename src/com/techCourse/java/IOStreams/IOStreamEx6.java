package com.techCourse.java.IOStreams;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamEx6 {
		public static void main(String[] args) throws IOException  {
		File basePath = new File(System.getProperty("user.dir") + "\\src\\com\\techCourse\\java\\IOStreams");
		File destFile = new File(basePath, "dest2.txt");
		FileOutputStream fileOut = new FileOutputStream(destFile);
		int a = 9870;
		float c = 10.3f;
		DataOutputStream dout = new DataOutputStream(fileOut);
		
		dout.writeInt(a);
		dout.writeFloat(c);
		fileOut.close();
		
		FileInputStream fileIn = new FileInputStream(destFile);
		
		DataInputStream din = new DataInputStream(fileIn);
		
		int b = din.readInt();
		float d = din.readFloat();
		System.out.println(b + " " +d);
		
		fileIn.close();
	}

}
