package com.company;

public class TemperatureConverter {

	public double convertFarenheitToCelsius(double farenheit) {
		return (farenheit - 32) * 5 / 9;
	}

	public double convertFarenheitToKelvin(double farenheit) {
		return convertFarenheitToCelsius(farenheit) + 273.15;
	}

	public double convertCelsiusToFarenheit(double celsius) {
		return celsius * 9 / 5 + 32;
	}

	public double convertCelsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}

	public double convertKelvinToFarenheit(double kelvin) {
		return convertCelsiusToFarenheit(kelvin - 273.15);
	}

	public double convertKelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
}