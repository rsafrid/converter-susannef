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
	public void testMilimeterPositiveNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * 100;
			result = valueToConvert * 10;
			LOG.info("Testing the method millimeter with positive number: "+ valueToConvert);
			assertEquals(bc.millimeter(valueToConvert), result, 0.1);
		}	
	}
	
	@Test
	public void testMilimeterNegativeNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * -100;
			result = valueToConvert * 10;
			LOG.info("Testing the method millimeter with negative number: "+ valueToConvert);
			assertEquals(bc.millimeter(valueToConvert), result, 0.1);
		}	
	}
	
	@Test
	public void testMilimeterZero() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = 0;
			result = valueToConvert * 10;
			LOG.info("Testing the method millimeter with 0: "+ valueToConvert);
			assertEquals(bc.millimeter(valueToConvert), result, 0.1);
		}	
	}
	
	@Test
	public void testCentimeterPositiveNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * 100;
			result = valueToConvert * 1;
			LOG.info("Testing the method centimeter with positive number: "+ valueToConvert);
			assertEquals(bc.centimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testCentimeterNegativeNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * -100;
			result = valueToConvert * 1;
			LOG.info("Testing the method centimeter with negative number: "+ valueToConvert);
			assertEquals(bc.centimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testCentimeterZero() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = 0;
			result = valueToConvert * 1;
			LOG.info("Testing the method centimeter with 0: "+ valueToConvert);
			assertEquals(bc.centimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testDecimeterPositiveNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * 100;
			result = valueToConvert * 0.1;
			LOG.info("Testing the method decimeter with positive number: "+ valueToConvert);
			assertEquals(bc.decimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testDecimeterNegativeNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * -100;
			result = valueToConvert * 0.1;
			LOG.info("Testing the method decimeter with negative number: "+ valueToConvert);
			assertEquals(bc.decimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testDecimeterZero() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = 0;
			result = valueToConvert * 0.1;
			LOG.info("Testing the method decimeter with 0: "+ valueToConvert);
			assertEquals(bc.decimeter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testMeterPositieNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * 100;
			result = valueToConvert * 0.01;
			LOG.info("Testing the method meter with positive number: "+ valueToConvert);
			assertEquals(bc.meter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testMeterNegatieNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * -100;
			result = valueToConvert * 0.01;
			LOG.info("Testing the method meter with negative number: "+ valueToConvert);
			assertEquals(bc.meter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testMeterZero() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert =  0;
			result = valueToConvert * 0.01;
			LOG.info("Testing the method meter with 0: "+ valueToConvert);
			assertEquals(bc.meter(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testFotPositiveNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * 100;
			result = valueToConvert * 29.6;
			LOG.info("Testing the method fot with positive number: "+ valueToConvert);
			assertEquals(bc.fot(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testFotNegatieNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * -100;
			result = valueToConvert * 29.6;
			LOG.info("Testing the method fot with negative number: "+ valueToConvert);
			assertEquals(bc.fot(valueToConvert), result, 0.1);
		}
	}
	@Test
	public void testFotZero() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = 0;
			result = valueToConvert * 29.6;
			LOG.info("Testing the method fot with 0: "+ valueToConvert);
			assertEquals(bc.fot(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testAlnPositiveNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * 100;
			result = valueToConvert * 59.38;
			LOG.info("Testing the method aln with positive number: "+ valueToConvert);
			assertEquals(bc.aln(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testAlnNegativeNumber() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = random.nextDouble() * -100;
			result = valueToConvert * 59.38;
			LOG.info("Testing the method aln with negative number: "+ valueToConvert);
			assertEquals(bc.aln(valueToConvert), result, 0.1);
		}
	}
	
	@Test
	public void testAlnZero() {
		double valueToConvert = 0.0;
		double result = 0.0;
		for(int i = 0; i < 50; i++) {
			valueToConvert = 0;
			result = valueToConvert * 59.38;
			LOG.info("Testing the method aln with 0: "+ valueToConvert);
			assertEquals(bc.aln(valueToConvert), result, 0.1);
		}
	}

}