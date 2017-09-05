package ru.job4j.array;
/**
 * Turn back array.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
	/**
	 * Turn back array.
	 * @param array is array of numbers
	 * @return imagine of piramid by stringbuilder
	 */
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int cache = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = cache;
		}
		return array;
	}
}