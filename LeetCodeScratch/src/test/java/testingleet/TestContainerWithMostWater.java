package testingleet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetscratch.ContainerWithMostWater;

class TestContainerWithMostWater {

	@Test
	void baseCase49() {
		
		int height[] = {1,8,6,2,5,4,8,3,7};
		
		assertEquals(49, ContainerWithMostWater.maxArea(height));
	}

}
