package leetscratch;

/**
 * @author Dimka 
 * LeetCode 
 * 6. ZigZag Conversion
 */
public class Zigzag {

	public static String convert(String s, int numRows) {

		if (s.length() <= numRows || numRows == 1)
			return s;

		--numRows; // make rows zero-based. Makes calculating offset easier.

		char[] array = s.toCharArray();
		char[] outArray = new char[array.length];
		int outIndex = 0;

		for (int row = 0; row <= numRows; row++) {
			boolean down = true;
			boolean endOfRow = false;

			int downOffset = (numRows - row) * 2;
			int upOffset = row * 2;

			int index = row;
			outArray[outIndex] = array[index];
			++outIndex;

			while (endOfRow != true) {
				if (down) {

					if (downOffset == 0) {
						down = false;
						continue;
					}

					if (index + downOffset < array.length) {
						index += downOffset;
						outArray[outIndex] = array[index];
						++outIndex;
						down = false;
					} else
						endOfRow = true;
				} else { // UP

					if (upOffset == 0) {
						down = true;
						continue;
					}

					if (index + upOffset < array.length) {
						index += upOffset;
						outArray[outIndex] = array[index];
						++outIndex;
						down = true;
					} else
						endOfRow = true;
				}
			}
		}

		return new String(outArray);
	}
}
