package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {
	

	private Double radius;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius; 
	}
	
	

}
