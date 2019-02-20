package com.bhanu;

public class GameOfLife {

	/*
	 * This method finds the total number of living cells by adding
	 * the values in the all the neighbor nodes
	 * Assuming 
	 * 0 --> Dead 
	 * 1 --> Alive     
	 *     
	 */
	public static int neighborSum(int[][] nodes, int x, int y) {
		int total = 0;

		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if ((i == x && j == y) || (i < 0 || j < 0) || (i >= nodes.length || j >= nodes[0].length))
					continue;
				total = total + nodes[i][j];
			}
		}

		return total;
	}
	

	/*
	 * This method finds the next state of all the cells in the grid
	 * by the conditions mentioned in the game of life and print the 
	 * values to standard output
	 * 
	 */
	public int[][] nextGen(int[][] nodes) {
		int[][] out = new int[nodes.length][nodes[0].length];
		for (int i = 0; i < nodes.length; i++) {
			for (int j = 0; j < nodes[i].length; j++) {
				// finding number of live neighbor cells for around each cell
				int sum = GameOfLife.neighborSum(nodes, i, j);
				// if a cell is alive
				if (nodes[i][j] == 1) {
					// if only one live neighbor cell then output cell is dead(Under population)
					if (sum == 1)
						out[i][j] = 0;
					// if two live neighbor cells then output cell is alive
					if (sum == 2)
						out[i][j] = 1;
					// if three live neighbor cells then output cell is alive
					if (sum == 3)
						out[i][j] = 1;
					// if more than three neighbor cells then output cell is dead(Over population)
					if (sum > 3)
						out[i][j] = 0;
				} else // if a cell is dead
				{
					// if exactly three live neighbor cells then output cell is alive(Reproduction)
					if (sum == 3)
						out[i][j] = 1;
				}
				if (out[i][j] == 0) 
					System.out.print(" . ");
				else
					System.out.print(" o ");
			}
			System.out.println();
		}
		return out;
	}
	
	
    /*
     * This method accepts rows and columns as input
     * and randomly generate the values and returns 
     * the input grid. It also prints the values to 
     * standard input.
     */
	public int[][] fillNFormat(int r,int c) {
		int[][] cells = new int[r][c];
		int random = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				random=(int) Math.round(Math.random());
				if (random == 0) {
					cells[i][j]=random;
					System.out.print(" . ");
				}
				else {
					cells[i][j]=random;
					System.out.print(" o ");
				}
			}
			System.out.println();
		}
		return cells;
	}

}
