package ru.job4j.loop;
/**
 * Summary even numbers from 1 to 10.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
class Counter {
	/**
	* Summary of even.
	* @param start is start number
	* @param finish is finish number
	* @return sum is summary from 1 to 10
	*/
	public int add(int start, int finish) {
		int sum = 0;
		for (int i = start; i <= finish; i++) {
		if (i % 2 == 0) {
		sum = sum + i;
		}
		} return sum;
	}
}