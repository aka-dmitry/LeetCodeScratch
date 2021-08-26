package leetscratch;

/**
 * LeetCode problem 11
 * 
 * Given n non-negative integers a1, a2, ..., an , where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of the line i is at (i, ai) and (i, 0). Find two lines, which, together with
 * the x-axis forms a container, such that the container contains the most
 * water.
 * 
 * @author Dimka
 *
 *	This is the 'naive' solution...
 *	Time limit exceeded as expected :/
 *
 */
public class ContainerWithMostWater {

	// TODO : find a better solution. O(n^2) is not going to cut it.
	public static int maxArea(int[] height) {

		int max = 0;

		for (int lineOneIndex = 0; lineOneIndex < height.length - 1; lineOneIndex++) {
			
			int firstHeight = height[lineOneIndex];
			int firstLocation = lineOneIndex + 1;
			
			for (int lineTwoIndex = lineOneIndex + 1; lineTwoIndex < height.length; lineTwoIndex++) {
				
				int secondHeight = height[lineTwoIndex];
				int secondLocation = lineTwoIndex + 1;
				
				int lowestOfTwo = firstHeight < secondHeight ? firstHeight : secondHeight; 
				int tempArea = (secondLocation - firstLocation) * lowestOfTwo;
				
				if(tempArea > max)
					max = tempArea;
			}
		}

		return max;
	}
}
