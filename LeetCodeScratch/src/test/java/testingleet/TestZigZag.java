package testingleet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetscratch.Zigzag;

class TestZigZag {

	@Test
	void testConvert() {
		String s = "PAYPALISHIRING";
		String expected = "PAHNAPLSIIGYIR";
		String converted = Zigzag.convert(s, 3);
		
		assertEquals(expected, converted, "Did not generate the expected string of: "+expected);
	}

}
