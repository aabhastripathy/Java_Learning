package org.ycpait.Geometry_app.entity;

public class Rectangle extends Shape {
	private float length;
	private float breadth;
	//private String color;
	
	
	public Rectangle(float length, float breadth, String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		//this.color = color;
	}
	
	public float calculateArea() {
		return length*breadth;
	}
	
	public void draw() {
		super.draw();
		System.out.println("Rectangle is drawn using length : " + this.length + " and breath "+ this.breadth);
	}
}
