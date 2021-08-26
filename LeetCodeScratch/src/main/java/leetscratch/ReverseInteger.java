package leetscratch;

/**
 * LeetCode Problem 7
 * 
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 * 
 * @author Dimka
 *
 *         Integer.MAX_VALUE: 2147483647
 */

public class ReverseInteger {

	public static int reverse(int x) {
		
		String xString = x + "";
		if(xString.length() == 1 || (xString.length() == 2 && xString.startsWith("-")))
			return x;
		
		String reverseStringX = flip(xString);
		
		int returnInt = 0;

		try {
			returnInt = Integer.parseInt(reverseStringX);
		}catch(NumberFormatException e) {
			return 0;
		}
		
		
		return returnInt;
	}

	private static String flip(String s) {
		
		char[] charArray = s.toCharArray();
		
		// preserve negative
		int i = charArray[0] == '-' ? 1 : 0;
		int j = charArray.length - 1;
		char temp;
		
		while(i < j) {
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			
			++i;
			--j;
		}
		
		return new String(charArray);
	}
}
