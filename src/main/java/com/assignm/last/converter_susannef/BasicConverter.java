package com.assignm.last.converter_susannef;

public class BasicConverter implements ConverterBasicOperationsInterface{

	public double millimeter(double firstNumber, double secondNumber) {
		double result = firstNumber * 0.1;
		return result;
	}

	public double centimeter(double firstNumber, double secondNumber) {
		double result = firstNumber * 1;
		return result;
	}

	public double decimeter(double firstNumber, double secondNumber) {
		double result = firstNumber * 10;
		return result;
	}

	public double meter(double firstNumber, double secondNumber) {
		double result = firstNumber * 100;
		return result;
	}

	public double kilometer(double firstNumber, double secondNumber) {
		double result = firstNumber * 1000;
		return result;
	}

	public double mil(double firstNumber, double secondNumber) {
		double result = firstNumber * 10000;
		return result;
	}

	
	

}
