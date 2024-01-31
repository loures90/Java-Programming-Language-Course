package com.techCourse.java.IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
							// Mark interface
class Rectangle implements Serializable {
	private double w;
	private double h;
	public Rectangle(double w, double h){
		this.w = w;
		this.h = h;
	}
	public void print() {
		System.out.println("Width " + this.w + " - height " + this.h);
	}
}

public class IOStreamEx7 {
		public static void main(String[] args) throws IOException, ClassNotFoundException  {
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(5,30);
		File basePath = new File(System.getProperty("user.dir") + "\\src\\com\\techCourse\\java\\IOStreams");
		File destFile = new File(basePath, "dest2.txt");
		
		FileOutputStream fileOut = new FileOutputStream(destFile);
		ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
		objOut.writeObject(r1);
		objOut.writeObject(r2);
		
		fileOut.close();
		
		FileInputStream fileIn = new FileInputStream(destFile);
		ObjectInputStream objIn = new ObjectInputStream(fileIn);
		Rectangle r3, r4;
		
		r3 = (Rectangle) objIn.readObject();
		r4 = (Rectangle) objIn.readObject();
		r3.print();
		r4.print();
		fileIn.close();
	}

}
