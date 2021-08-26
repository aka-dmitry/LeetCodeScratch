package leetscratch;

/**
 * @author Dimka
 * 
 * 
 *         Success 
 *         Details Runtime: 118 ms, faster than 39.74% of Java online
 *         submissions for Longest Palindromic Substring. Memory Usage: 39.1 MB,
 *         less than 72.60% of Java online submissions for Longest Palindromic
 *         Substring.
 */
public class Palindrome {
	public static String longestPalindrome(String s) {

		if (s.length() == 1)
			return s;

		if (s.length() == 2) {
			if (isPalindrome(s.toCharArray(), 0, 1))
				return s;

			return s.substring(0, 1);
		}

		char[] array = s.toCharArray();

		for (int i = 0; i < array.length; i++) {
			int offset = array.length - i - 1;

			for (int j = 0; j <= i; j++) {

				if (isPalindrome(array, j, j + offset))
					return s.substring(j, j + offset + 1);

			}
		}

		return s;
	}

	public static boolean isPalindrome(char[] r, int start, int end) {

		if (r.length == 1)
			return true;

		int i = start;
		int j = end;

		while (i < j) {
			if (r[i] != r[j])
				return false;

			++i;
			--j;
		}

		return true;
	}


}
