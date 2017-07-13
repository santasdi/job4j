package ru.job4j.array;
/**
* Sort array by BubbleSort method.
* @author Artem Bartenev (bartenev92@gmail.com)
* @version $Id$
* @since 0.1
*
*/
public class BubbleSort {
	/**
	* Sort array.
	* @param array is int array of numbers
	* @return array after sort
	*/
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
				int temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}