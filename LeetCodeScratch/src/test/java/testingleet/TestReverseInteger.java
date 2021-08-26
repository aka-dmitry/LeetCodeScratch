package testingleet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetscratch.ReverseInteger;

class TestReverseInteger {

	@Test
	void testTruePositiveValue() {
		
		int testInt = 123456;
		int reversedInt = ReverseInteger.reverse(testInt);
		
		assertEquals(654321, reversedInt);
	}

	@Test
	void testNegativeValue() {
		
		int testInt = -77722;
		int reversedInt = ReverseInteger.reverse(testInt);
		
		assertEquals( -22777, reversedInt, "Not the expected value");
		
	}
}
