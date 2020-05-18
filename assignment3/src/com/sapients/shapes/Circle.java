package com.sapients.shapes;

public class Circle {
	
	int radius;
	
	public Circle(int length) {
		this.radius = length;
	}

	public void calculateArea() {
		System.out.println("The Area of the Circle is " + 3.14 *radius * radius); 
	}
	
}
