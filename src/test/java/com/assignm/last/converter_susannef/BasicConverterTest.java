package com.assignm.last.converter_susannef;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BasicConverterTest {
	BasicConverter bc = new BasicConverter();
	
	/*@Test
	public void testMilimeter() {
		assertEquals(bc.millimeter(1.0, 0.1), 1.0, 0.1);
	}*/
	
	@Test
	public void testCentimeter() {
		assertEquals(bc.centimeter(1.0, 1.0), 1.0, 1.0);
	}

}
