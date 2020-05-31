package com.company;

public class DistanceConverter {

	private double unitMileToMeter = 1609.34;

	public double convertMetersToMiles(double meter) {
		return meter / unitMileToMeter;
	}

	public double convertMilesToMeters(double mile) {
		return mile * unitMileToMeter;
	}
}
