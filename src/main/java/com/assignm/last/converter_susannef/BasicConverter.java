package com.assignm.last.converter_susannef;

public class BasicConverter implements ConverterBasicOperationsInterface {

	public double millimeter(double number) {
		double result = number * 10;
		return result;
	}

	public double centimeter(double number) {
		double result = number * 1;
		return result;
	}

	public double decimeter(double number) {
		double result = number * 0.1;
		return result;
	}

	public double meter(double number) {
		double result = number * 0.01;
		return result;
	}

	public double kilometer(double number) {
		double result = number * 0.00001;
		return result;
	}

	public double mil(double number) {
		double result = number * 0.000001;
		return result;
	}

	
	

}
