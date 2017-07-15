package ru.job4j.array;
/**
 * Rotate array clockwise.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 15.07.2017
 */
 public class RotateArray {
	/**
	* Turn array clockwise.
	* @param array is taking array
	* @return array after clockwise
	*/
	public int[][] rotate(int[][] array) {
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = i; j <  array.length - 1 - i; j++) {
			temp = array[i][j];
			array[i][j] = array[array.length - j - 1][i];
			array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
			array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
			array[j][array.length - i - 1] = temp;
			}
		}
		return array;
	}
}