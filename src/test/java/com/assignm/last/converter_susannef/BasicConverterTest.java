package com.assignm.last.converter_susannef;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicConverterTest {
	BasicConverter bc = new BasicConverter();
	
	@Test
	public void testMilimeter() {
		double valueToConvert = 10;
		double result = valueToConvert * 10;

		assertEquals(bc.millimeter(valueToConvert), result, 0.1);
	}
	
	@Test
	public void testCentimeter() {
		double valueToConvert = 10;
		double result = valueToConvert * 1;
		assertEquals(bc.centimeter(valueToConvert), result, 1.0);
		
	}
	
	@Test
	public void testDecimeter() {
		double valueToConvert = 10;
		double result = valueToConvert * 0.1;
		assertEquals(bc.decimeter(valueToConvert), result, 0.1);
	}
	
	@Test
	public void testMeter() {
		double valueToConvert = 10;
		double result = valueToConvert * 0.01;
		assertEquals(bc.meter(valueToConvert), result, 0.1);
	}
	
	@Test
	public void testKilometer() {
		double valueToConvert = 10;
		double result = valueToConvert * 0.00001;
		assertEquals(bc.kilometer(valueToConvert), result, 0.1);
	}
	
	@Test
	public void testMil() {
		double valueToConvert = 10;
		double result = valueToConvert * 0.000001;
		assertEquals(bc.mil(valueToConvert), result, 0.1);
	}

}