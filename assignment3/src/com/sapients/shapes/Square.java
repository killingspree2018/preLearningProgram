package com.sapients.shapes;

public class Square {
	
	int sides;
	public Square(int length) {
		this.sides = length;
	}

	public void calculateArea() {
		 System.out.println("The Area of the Square is " + sides  * sides);
	
	}
}
