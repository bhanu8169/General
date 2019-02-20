package com.bhanu;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int r = 0;
		int c = 0;
		if (args.length != 2) {

			try {
				System.out.println("Must Pass two arguments");
				System.out.println("Usage : java -jar gameoflife.jar no_of_rows no_of_cols");
				// throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				throw e;
			}
		}
		r = Integer.parseInt(args[0]);
		c = Integer.parseInt(args[1]);

		GameOfLife game = new GameOfLife();
		System.out.println("Input Format\n");
		int[][] cells = game.fillNFormat(r, c);
		System.out.println("\nOutput Format\n");
		game.nextGen(cells);

	}
}
