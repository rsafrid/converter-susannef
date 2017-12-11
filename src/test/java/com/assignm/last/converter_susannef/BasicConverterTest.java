/**
 * @author susanne fridh
 * @version 1.0
 * 
 * This is the test class BasicConverterTest.java
 */

package com.assignm.last.converter_susannef;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicConverterTest {
	BasicConverter bc = new BasicConverter();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicConverter.class.getName());
	
	// Testing random numbers between 0-10 fifty times each.
	@Test
	public void testMilimeter() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextInt(10);
			result = valueToConvert * 10;
			LOG.info("Testing the method millimeter with: "+ valueToConvert);
			assertEquals(bc.millimeter(valueToConvert), result, 0.1);
		}	
	}
	
	@Test
	public void testCentimeter() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextInt(10);
			result = valueToConvert * 1;
			LOG.info("Testing the method centimeter with: "+ valueToConvert);
			assertEquals(bc.centimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testDecimeter() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextInt(10);
			result = valueToConvert * 0.1;
			LOG.info("Testing the method decimeter with: "+ valueToConvert);
			assertEquals(bc.decimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testMeter() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextInt(10);
			result = valueToConvert * 0.01;
			LOG.info("Testing the method meter with: "+ valueToConvert);
			assertEquals(bc.meter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testFot() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextInt(10);
			result = valueToConvert * 29.6;
			LOG.info("Testing the method fot with: "+ valueToConvert);
			assertEquals(bc.fot(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testAln() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextInt(10);
			result = valueToConvert * 59.38;
			LOG.info("Testing the method aln with: "+ valueToConvert);
			assertEquals(bc.aln(valueToConvert), result, 0.1);
		}
	}

}