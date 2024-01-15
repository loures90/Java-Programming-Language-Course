package com.techCourse.java.abstracts;

abstract class Graphic {
	protected int x1, y1, x2, y2;
	public void setStart(int x1, int y1){
		this.x1 = x1;
		this.y1 = y1;
	}
	public void setEnd(int x2, int y2){
		this.x2 = x2;
		this.y2 = y2;
	}
	abstract public void draw();
}

class Line extends Graphic {
	@Override
	public void draw(){
		System.out.println("Draw line from (" + this.x1 + ", " + this.y1 + ") to (" + this.x2 + ", " + this.y2 + ")");
	}
}

class Rectangle extends Graphic {
	@Override
	public void draw(){
		System.out.println("Draw rectangle from (" + this.x1 + ", " + this.y1 + ") to (" + this.x2 + ", " + this.y2 + ")");
	}
}
public class abstractExercise {
	
	static void drawGraphic(int x1, int y1, int x2, int y2, Graphic graphic) {
		graphic.setStart(x1, y1);
		graphic.setEnd(x2, y2);
		graphic.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();
		drawGraphic(4,3, 2,5, line);
		
		Rectangle rec = new Rectangle();
		drawGraphic(1,2, 3,9, rec);
	}

}
