package com.company;

public class CurrencyConverter {

	private double exchangeRateDollarToEuro = 0.9;
	private double exchangeRateDollarToDram = 483.7;
	private double exchangeRateDollarToRuble = 70.37;

	private double exchangeRateEuroToRuble = 78.08;
	private double exchangeRateEuroToDram = 537.93;
	private double exchangeRateDramToRuble = 0.15;

	public double convertDollarToEuro(double dollar) {
		return exchangeRateDollarToEuro * dollar;
	}

	public double convertDollarToDram(double dollar) {
		return exchangeRateDollarToDram * dollar;
	}

	public double convertDollarToRuble(double dollar) {
		return exchangeRateDollarToRuble * dollar;
	}

	public double convertEuroToDollar(double euro) {
		return euro / exchangeRateDollarToEuro;
	}

	public double convertEuroToDram(double euro) {
		return exchangeRateEuroToDram * euro;
	}

	public double convertEuroToRuble(double euro) {
		return exchangeRateEuroToRuble * euro;
	}

	public double convertDramToDollar(double dram) {
		return dram / exchangeRateDollarToDram;
	}

	public double convertDramToEuro(double dram) {
		return dram / exchangeRateEuroToDram;
	}

	public double convertDramToRuble(double dram) {
		return exchangeRateDramToRuble * dram;
	}

	public double convertRubleToDollar(double ruble) {
		return ruble / exchangeRateDollarToRuble;
	}

	public double convertRubleToEuro(double ruble) {
		return ruble / exchangeRateEuroToRuble;
	}

	public double convertRubleToDram(double ruble) {
		return ruble / exchangeRateDramToRuble;
	}
}