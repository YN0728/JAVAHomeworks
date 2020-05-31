package com.company;

public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double calculatePerimeter() {
		return sideA + sideB + sideC;
	}

	public double calculateArea() {
		double perimeter = calculatePerimeter();
		return Math.sqrt(perimeter / 2 * (perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - sideC));
	}
}