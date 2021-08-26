package testingleet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetscratch.Palindrome;

class TestPalindrome {

	@Test
	void testLongestPalindrome() {
		fail("Not yet implemented");
	}

	@Test
	void testIsPalindrome() {
		String input = "aaaaasdsdsdsaba";
		System.out.println("substring: "+input.substring(5,12));
		char[] charArray = input.toCharArray();
		boolean output = Palindrome.isPalindrome(charArray, 5, 13);
		System.out.println("output: "+output);
		
		assertEquals(output, true, "isPalindrome returned \"false\" when true.");
	}
}
