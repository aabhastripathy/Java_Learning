package org.ycpait.Geometry_app.entity;

public class Circle  extends Shape  {
		float radius;
		//String color;
		
		
		public Circle(float radius, String color) {
			super(color);
			this.radius = radius;
			//this.color = color;
		}
		
		public float CalculateArea() {
			return 3.14f*radius*radius;
		}
		
		public void draw() {
			super.draw();
			System.out.println("Circle is drawn using radius : " + this.radius);
		}



}
