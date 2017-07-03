package ru.job4j.loop;
/**
 * Calculate factorial from 1 to 5.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
class Factorial {
	/**
	* Factorial from 1 to 5.
	* @param n is number
	* @return value of factorial
	*/
	public int calc(int n) {
	int factorial = 1;
	if (n != 0) {
	for (int i = 1; i <= n; i++) {
	factorial = factorial * i;
	}
	}
	return factorial;
}
}