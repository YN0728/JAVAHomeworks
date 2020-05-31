package com.company;

public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateCircumference() {
		return Math.PI * 2 * radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}