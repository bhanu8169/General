package com.bhanu;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void evalnextGen() {
		GameOfLife game=new GameOfLife();
		int[][] c1= {
				{0,1,0},
				{1,0,1},
				{0,0,1}
		};
		int[][] actual= game.nextGen(c1);
		System.out.println(Arrays.deepToString(actual));
		int[][] expected= {
				{0,1,0},
				{0,0,1},
				{0,1,0}
		};
		Assert.assertArrayEquals(expected, actual);
		int total=GameOfLife.neighborSum(c1, 0, 0);
		Assert.assertEquals(2, total);
		
	}
	
}
