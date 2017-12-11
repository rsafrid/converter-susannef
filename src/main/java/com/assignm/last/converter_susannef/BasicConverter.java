/**
 * @author susanne fridh
 * @version 1.0
 * 
 * This is the BasicConverter class with all calculations for each button.
 */

package com.assignm.last.converter_susannef;

public class BasicConverter implements ConverterBasicOperationsInterface {
	
	/**
	 * My methods returning calculated result
	 * 
	 * @return result
	 *
	 */	
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

	public double fot(double number) {
		double result = number * 29.6;
		return result;
	}

	public double aln(double number) {
		double result = number * 59.38;
		return result;
	}

	
	

}
