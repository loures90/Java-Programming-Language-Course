package com.techCourse.java.inheritance;

class Point2D {
	protected int x, y; // allows subclasses to access
	public Point2D() {}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.printf("(%d, %d)", x,y);
	}
}

class Point3D extends Point2D{
	private int z;
	public Point3D() {
//		super(); Not required, by default the constructor is called
	}
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	@Override
	public void print() {
		System.out.printf("(%d, %d, %d)", x,y, z);
	}
}

public class InheritanceEx5 {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 30);
		p1.print();
		System.out.println();
		Point3D p2 = new Point3D(10, 30,40);
		p2.print();
	}	

}
